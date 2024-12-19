import java.util.Objects;

public class BrokerMetadataZoneRack {
    public long id;

    public long zoneId;

    /**
     * @param id     an integer that uniquely identifies this broker
     * @param zoneId the rack of the broker, which is used to in rack aware partition assignment for fault tolerance.
     *               Examples: "RACK1", "zoneId"
     */
    public BrokerMetadataZoneRack(long id, long zoneId) {
        this.id = id;
        this.zoneId = zoneId;
    }

    public BrokerMetadataZoneRack() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokerMetadataZoneRack that = (BrokerMetadataZoneRack) o;
        return id == that.id && Objects.equals(zoneId, that.zoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zoneId);
    }

    @Override
    public String toString() {
        return "BrokerMetadataZoneRack{" +
            "id=" + id +
            ", zoneId=" + zoneId +
            '}';
    }
}
