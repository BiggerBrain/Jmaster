
package benum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * enum的好处：类型安全和可读性
 */
enum Color {
            RED, YELLOW, GREEN, BLACK
}

enum Color1 {
             RED("红色", 2), YELLOW("黄色", 2), GREEN("绿色", 3), BLACK("黑色", 4);

    // 成员变量
    private final String name;
    private final int    index;

    // 构造方法，默认就是private修饰
    Color1(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

/**
 * @author lishixiong
 * @version 1.0: EnumExample.java, v 0.1 2019年04月30日 16:08 lishixiong Exp $
 */
class AppMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<ArrayList<Integer>> codeArrays = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < 1000000; j++) {
                array.add(start++);
            }
            Collections.shuffle(array);
            codeArrays.add(array);
        }

        HashSet<Integer> test = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        ArrayList<Integer> seg = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            seg.add(i);
        }

        for (int j = 0; j < 1000000; j++) {
            Collections.shuffle(seg);
            for (int i = 0; i < 10; i++) {
                int r = codeArrays.get(seg.get(i)).get(j);
                test.add(r);
                result.add(r);
            }
        }
        //        for (int i = 0; i < 1000 * 10000; i++) {
        //            if (!test.contains(i)) {
        //                System.out.println("错误" + i);
        //            }
        //        }
        //
        //        for (Integer integer : result) {
        //            System.out.println(String.format("%07d", integer));
        //        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
}