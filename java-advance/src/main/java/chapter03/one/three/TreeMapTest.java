package chapter03.one.three;

import java.util.TreeMap;

/**
 * HashMap、HashSet与TreeMap、TreeSet两类集合，
 * HashMap、HashSet的存储集合元素的方式类似于“妈妈放东西”，不同的东西放在不同的位置，需要时快速找到它们；
 * TreeMap、TreeSet的存储集合元素类似于“体育课站队”，第一个人（相当于元素）自成一队，后续向这个队向前/向后插队，保证队的有序性
 * <p>
 * 劣势：
 * TreeMap添加元素、取出元素的性能都比HashMap低
 * 当TreeMap添加元素时，需要通过循环找到新增Entry的插入位置，因此比较耗性能。
 * <p>
 * 优势：
 * TreeMap中的所有Entry总是按TreeMap根据指定排序规则保持有序状态
 */
public class TreeMapTest {
    public static void main(String[] args) {
        /*
         * 红黑树
         */
        TreeMap<String, Double> map = new TreeMap<>();
        map.put("ccc", 89.0);
        map.put("aaa", 80.0);
        map.put("zzz", 80.0);
        map.put("bbb", 89.0);
        System.out.println(map);
    }
}
