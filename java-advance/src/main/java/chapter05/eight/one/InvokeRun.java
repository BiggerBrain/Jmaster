package chapter05.eight.one;

public class InvokeRun extends Thread {
    private int i;
    // 重写run方法，run方法的方法体就是线程执行体

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // 调用Thread的currentThread方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                // 直接调用线程对象的run方法
                // 系统会把线程对象当成普通对象，把run方法当成普通方法
                // 所以，下面两行代码并不会启动2条线程，而是依次执行2个run方法
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }

    @Override
    public void run() {
        for (; i < 100; i++) {
            // 直接调用run方法时，Thread的this.getName返回该对象名字
            // 而不是当前线程的名字
            // 使用Thread.currentThread().getName()总是获取当前线程名字
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
