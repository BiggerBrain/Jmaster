package bcollection.blist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: a.java, v 0.1 2019年04月30日 15:32 lishixiong Exp $
 * 循环删除List中null对象
 */
public class ListDelete {
    /**
     * 推荐
     *
     * @param input
     * @see
     */
    private static void removeNull(List<?> input) {
        Iterator<?> iterator = input.iterator();
        while (iterator.hasNext()) {
            Object s = iterator.next();
            if (null == s) {
                iterator.remove();
            }
        }
    }

    /**
     * 不太推荐
     *
     * @param input
     */
    private static void removeNull1(List<?> input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        for (int i = 0; i < input.size();) {
            if (input.get(i) == null) {
                input.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add(null);
        stringArrayList.add(null);
        stringArrayList.add("B");
        stringArrayList.removeIf(str -> str == null);
        stringArrayList.stream().forEach(str -> {
            System.out.printf(str + "\n");
        });
    }
}
