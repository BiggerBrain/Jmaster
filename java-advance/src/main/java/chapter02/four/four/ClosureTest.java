package chapter02.four.four;

public class ClosureTest {
    /**
     * 内部类可能扩大局部变量的作用于，如果再加上这个被内部类访问的局部变量没有使用final
     * 修饰，也就是说该变量的值可以随意改变
     *
     * @param args
     */
    public static void main(String[] args) {
        // 定义一个局部变量
        final String str = "Java";
        // 在内部类里访问局部变量str
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    // 此处将一直可以访问到str局部变量
                    System.out.println(str + " " + i);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        // 执行到此处，main方法结束
        System.out.println("执行到此处，main方法结束");
    }
}
