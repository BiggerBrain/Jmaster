package chapter04.one.four;

import java.util.WeakHashMap;

class CrazyKey {
    String name;

    public CrazyKey(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o != null && getClass() == o.getClass()) {
            return name.equals(((CrazyKey) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "CrazyKey{" +
            "name='" + name + '\'' +
            '}';
    }
}

public class WeakHashMapTest {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<CrazyKey, String> map = new WeakHashMap<>();
        // 循环放入10个key-value对
        for (int i = 0; i < 10; i++) {
            map.put(new CrazyKey(i + 1 + ""), "value" + (i + 11));
        }
        // 垃圾回收之前，WeakHashMap与普通HashMap并无区别
        System.out.println(map);
        System.out.println(map.get(new CrazyKey("2")));
        // 通知垃圾回收
        System.gc();
        // 暂停当前线程50ms，让垃圾回收后台线程获得执行
        Thread.sleep(50);
        // 垃圾回收后，WeakHashMap里所有Entry全部清空
        System.out.println(map);
        System.out.println(map.get(new CrazyKey("2")));
    }
}
