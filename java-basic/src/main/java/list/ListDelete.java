package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class ListDelete {
    private static void removeNull(List<?> input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        for (int i = 0; i < input.size(); ) {
            if (input.get(i) == null) {
                input.remove(i);
            } else {
                i++;
            }
        }
    }

    /**
     * @param input
     * @see
     */
    private static void removeNull1(List<?> input) {
        Iterator<?> iterator = input.iterator();
        while (iterator.hasNext()) {
            Object s = iterator.next();
            if (null == s) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("A");
        test.add(null);
        test.add(null);
        test.add("b");
        removeNull1(test);
        System.out.println(test.toString());

    }
}
