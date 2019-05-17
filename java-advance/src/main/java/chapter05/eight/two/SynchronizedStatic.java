package chapter05.eight.two;

public class SynchronizedStatic implements Runnable {

    static boolean staticFlag = true;

    public static synchronized void test0() {
        for (int i = 0; i < 100; i++) {
            System.out.println("test0:" + Thread.currentThread().getName() + " " + i);
        }
    }

    /*public void test1() {
        synchronized (this) {
            for (int i = 0; i< 200; i++) {
                System.out.println("test1:" + Thread.currentThread().getName() + " " + i);
            }
        }
    }*/

    public static void main(String[] args) throws InterruptedException {
        SynchronizedStatic ss = new SynchronizedStatic();
        new Thread(ss).start();
        // 保证第一条线程开始运行
        Thread.sleep(1);
        new Thread(ss).start();
    }

    public void test1() {
        synchronized (SynchronizedStatic.class) {
            for (int i = 0; i < 200; i++) {
                System.out.println("test1:" + Thread.currentThread().getName() + " " + i);
            }
        }
    }

    @Override
    public void run() {
        if (staticFlag) {
            staticFlag = false;
            test0();
        } else {
            staticFlag = true;
            test1();
        }
    }
}
