import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {
        // 创建两个 Set
        ConcurrentHashMap<String, String> setA = new ConcurrentHashMap<>();
        setA.put("Apple", "1");
        setA.put("Banana", "1");
        setA.put("Cherry", "1");
        System.out.println("setA hashcode:" + setA.hashCode());
        setA.put("Cherryss", "1");
        System.out.println("setA hashcode:" + setA.hashCode());

        ConcurrentHashMap<String, String> setB = new ConcurrentHashMap<>();
        setB.put("Apple", "1");
        setB.put("Banana", "1");
        setB.put("Cherry111", "1");
        System.out.println("setB hashcode:" + setB.hashCode());

        // 输出原始集合
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // 使用 retainAll 方法
        boolean changed = setA.keySet().retainAll(setB.keySet());

        // 输出结果
        System.out.println("After retainAll:");
        System.out.println("Set A: " + setA + "setA values:" + setA.values());
        System.out.println("Set B: " + setB);
        System.out.println("Was Set A changed? " + changed);
    }
}
