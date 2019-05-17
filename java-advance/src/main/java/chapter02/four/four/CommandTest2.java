package chapter02.four.four;

import java.util.Arrays;

public class CommandTest2 {
    /**
     * Java要求所有被内部类访问的局部变量都使用final修饰也是有其原因的：对于普通局部变量而言，
     * 他的作用就是停留在该方法内，当方法执行结束，该局部变量也随之消失；
     * 但是内部类则可能产生隐式的“闭包”，闭包将使局部变量所里它所在的方法继续存在
     *
     * @param args
     */
    public static void main(String[] args) {
        CommandTest2 ct = new CommandTest2();
        final int seed = 5;
        class IntArrayProductorImpl implements IntArrayProductor {

            @Override
            public int product() {
                return (int) Math.round(Math.random() * seed);
            }
        }
        int[] result = ct.process(new IntArrayProductorImpl(), 6);
        System.out.println(Arrays.toString(result));
    }

    // 定义一个方法生成指定长度的数组，但每个数组元素由cmd负责产生
    public int[] process(IntArrayProductor cmd, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = cmd.product();
        }
        return result;
    }
}
