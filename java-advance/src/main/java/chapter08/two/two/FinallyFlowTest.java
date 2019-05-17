package chapter08.two.two;

public class FinallyFlowTest {
    public static void main(String[] args) {
        int a = test();
        System.out.println(a);
    }

    private static int test() {
        int count = 5;
        int a = 4;
        try {
            // 因为finally块中包含了return语句
            // 则下面的return语句不会立即返回
            return 4;
        } finally {
            System.out.println("finally块被执行");
            return ++count;
        }
    }
}
