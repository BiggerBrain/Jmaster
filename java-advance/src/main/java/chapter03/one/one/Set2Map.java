package chapter03.one.one;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class SimpleEntry<K, V> implements Map.Entry<K, V>, java.io.Serializable {

    private final K key;
    private V value;

    public SimpleEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public SimpleEntry(Map.Entry<? extends K, ? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    // 改变该key-value对的value值
    @Override
    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    // 根据key比较2个SimpleEntry是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (SimpleEntry.class == o.getClass()) {
            SimpleEntry se = (SimpleEntry) o;
            return se.getKey().equals(getKey());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return key == null ? 0 : key.hashCode();
    }

    @Override
    public String toString() {
        return "SimpleEntry{" +
            "key=" + key +
            ", value=" + value +
            '}';
    }
}

public class Set2Map<K, V> extends HashSet<SimpleEntry<K, V>> {

    // 实现清空所有key-value对的方法
    public void clear() {
        super.clear();
    }

    // 判断是否包含某个key
    public boolean containsKey(K key) {
        return super.contains(new SimpleEntry<K, V>(key, null));
    }

    // 判断是否包含某个value
    boolean containsValue(V value) {
        for (SimpleEntry<K, V> se : this) {
            if (se.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    // 根据指定key取出对应的value
    public V get(K key) {
        for (SimpleEntry<K, V> se : this) {
            if (se.getKey().equals(key)) {
                return se.getValue();
            }
        }
        return null;
    }

    // 将指定key-value对放入集合中
    public V put(K key, V value) {
        add(new SimpleEntry<>(key, value));
        return value;
    }

    // 将另一个Map的key-value对放入该Map中
    public void putAll(Map<? extends K, ? extends V> m) {
        for (K key : m.keySet()) {
            add(new SimpleEntry<>(key, m.get(key)));
        }
    }

    // 根据指定key删除指定key-value对
    public V removeEntry(K key) {
        for (Iterator<SimpleEntry<K, V>> it = this.iterator(); it.hasNext(); ) {
            SimpleEntry<K, V> en = it.next();
            if (en.getKey().equals(key)) {
                V v = en.getValue();
                it.remove();
                return v;
            }
        }
        return null;
    }

    // 获取该Map中包含多少个key-value对
    public int size() {
        return super.size();
    }

}
