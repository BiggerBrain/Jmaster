import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class BrokerPartitionReplicaAssignProvider {

    private static final Random RAND = new Random();

    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test1() {
        Collection<BrokerMetadataZoneRack> brokerMetadata = new ArrayList<>();
        brokerMetadata.add(new BrokerMetadataZoneRack(0, 1));
        brokerMetadata.add(new BrokerMetadataZoneRack(1, 1));
        brokerMetadata.add(new BrokerMetadataZoneRack(2, 1));
        System.out.println(get(3, 1, brokerMetadata, -1, -1));
    }

    private static void test2() {
        Collection<BrokerMetadataZoneRack> brokerMetadata = new ArrayList<>();
        brokerMetadata.add(new BrokerMetadataZoneRack(0, 1));
        brokerMetadata.add(new BrokerMetadataZoneRack(1, 2));
        brokerMetadata.add(new BrokerMetadataZoneRack(2, 1));
        System.out.println(get(3, 1, brokerMetadata, -1, -1));
    }

    public static Map<String, List<Long>> get(
        int nPartitions, int replicationFactor, Collection<BrokerMetadataZoneRack> brokerMetadata,
        int fixedStartIndex,
        int startPartitionId) {
        Map<Long, Long> brokerRackMap = new HashMap<>();
        brokerMetadata.forEach(m -> brokerRackMap.put(m.id, m.zoneId));
        int numRacks = new HashSet<>(brokerRackMap.values()).size();
        List<Long> arrangedBrokerList = getRackAlternatedBrokerList(brokerRackMap);
        int numBrokers = arrangedBrokerList.size();
        Map<String, List<Long>> ret = new HashMap<>();
        int startIndex = fixedStartIndex >= 0 ? fixedStartIndex : RAND.nextInt(arrangedBrokerList.size());
        int currentPartitionId = Math.max(0, startPartitionId);
        int nextReplicaShift = fixedStartIndex >= 0 ? fixedStartIndex : RAND.nextInt(arrangedBrokerList.size());
        for (int i = 0; i < nPartitions; i++) {
            if (currentPartitionId > 0 && (currentPartitionId % arrangedBrokerList.size() == 0)) {
                nextReplicaShift += 1;
            }

            int firstReplicaIndex = (currentPartitionId + startIndex) % arrangedBrokerList.size();
            long leader = arrangedBrokerList.get(firstReplicaIndex);
            List<Long> replicaBuffer = new ArrayList<>();
            replicaBuffer.add(leader);
            Set<Long> racksWithReplicas = new HashSet<>();
            racksWithReplicas.add(brokerRackMap.get(leader));
            Set<Long> brokersWithReplicas = new HashSet<>();
            brokersWithReplicas.add(leader);
            int k = 0;
            for (int j = 0; j < replicationFactor - 1; j++) {
                boolean done = false;
                while (!done) {
                    long broker = arrangedBrokerList
                        .get(replicaIndex(firstReplicaIndex,
                            nextReplicaShift * numRacks, k, arrangedBrokerList.size()));
                    Long rack = brokerRackMap.get(broker);
                    // Skip this broker if
                    // 1. there is already a broker in the same rack that has assigned a replica AND there is one or more racks
                    //    that do not have any replica, or
                    // 2. the broker has already assigned a replica AND there is one or more brokers that do not have replica assigned
                    if ((!racksWithReplicas.contains(rack) || racksWithReplicas.size() == numRacks)
                        && (!brokersWithReplicas.contains(broker) || brokersWithReplicas.size() == numBrokers)) {
                        replicaBuffer.add(broker);
                        racksWithReplicas.add(rack);
                        brokersWithReplicas.add(broker);
                        done = true;
                    }
                    k += 1;
                }
            }
            ret.put(String.valueOf(currentPartitionId), replicaBuffer);
            currentPartitionId += 1;
        }
        return ret;
    }

    private static int replicaIndex(int firstReplicaIndex, int secondReplicaShift, int replicaIndex, int nBrokers) {
        long shift = 1 + (secondReplicaShift + replicaIndex) % (nBrokers - 1);
        return (int) ((firstReplicaIndex + shift) % nBrokers);
    }

    /**
     * Given broker and rack information, returns a list of brokers alternated by the rack. Assume
     * this is the rack and its brokers:
     * <pre>
     * rack1: 0, 1, 2
     * rack2: 3, 4, 5
     * rack3: 6, 7, 8
     * </pre>
     * This API would return the list of 0, 3, 6, 1, 4, 7, 2, 5, 8
     * <br>
     * This is essential to make sure that the assignReplicasToBrokers API can use such list and
     * assign replicas to brokers in a simple round-robin fashion, while ensuring an even
     * distribution of leader and replica counts on each broker and that replicas are
     * distributed to all racks.
     */
    private static List<Long> getRackAlternatedBrokerList(Map<Long, Long> brokerRackMap) {
        Map<Long, Iterator<Long>> brokersIteratorByRack = new HashMap<>();
        getInverseMap(brokerRackMap).forEach((rack, brokers) -> brokersIteratorByRack.put(rack, brokers.iterator()));
        Long[] racks = brokersIteratorByRack.keySet().toArray(new Long[0]);
        Arrays.sort(racks);
        List<Long> result = new ArrayList<>();
        int rackIndex = 0;
        while (result.size() < brokerRackMap.size()) {
            Iterator<Long> rackIterator = brokersIteratorByRack.get(racks[rackIndex]);
            if (rackIterator.hasNext())
                result.add(rackIterator.next());
            rackIndex = (rackIndex + 1) % racks.length;
        }
        return result;
    }

    private static Map<Long, List<Long>> getInverseMap(Map<Long, Long> brokerRackMap) {
        Map<Long, List<Long>> results = new HashMap<>();
        brokerRackMap.forEach((id, rack) -> results.computeIfAbsent(rack, key -> new ArrayList<>()).add(id));
        results.forEach((rack, rackAndIdList) -> rackAndIdList.sort(Long::compareTo));
        return results;
    }
}
