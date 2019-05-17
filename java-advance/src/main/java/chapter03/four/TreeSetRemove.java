package chapter03.four;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetRemove {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("111");
        set.add("222");
        set.add("333");
        System.out.println(set);

        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String ele = it.next();
            if (ele.equals("333")) {
                set.remove(ele);
            }
        }

        System.out.println(set);
    }
}
