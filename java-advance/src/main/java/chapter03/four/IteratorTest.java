package chapter03.four;

import java.util.*;

enum Gender {
    MALE, FEMALE;
}

public class IteratorTest {
    public static void main(String[] args) {
        // 创建一个HashSet集合
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("hashSet:" + hashSet.iterator());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println("linkedHashSet:" + linkedHashSet.iterator());

        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("treeSet:" + treeSet.iterator());

        EnumSet<Gender> enumSet = EnumSet.allOf(Gender.class);
        System.out.println("enumSet:" + enumSet.iterator());

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("arrayList:" + arrayList.iterator());

        Vector<String> vector = new Vector<>();
        System.out.println("vector:" + vector.iterator());

        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("linkedList:" + linkedList.iterator());

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        System.out.println("arrayDeque:" + arrayDeque.iterator());
    }
}
