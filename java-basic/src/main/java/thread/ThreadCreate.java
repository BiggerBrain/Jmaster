package thread;

/**
 * 线程安全概念：当多个线程访问某一个类（对象或方法）时，这个对象始终都能表现出正确的行为，那么这个类（对象或方法）就是线程安全的。
 * synchronized：可以在任意对象及方法上加锁，而加锁的这段代码称为"互斥区"或"临界区"
 *
 * @author lishixiong
 */
public class ThreadCreate extends Thread {

    private int count = 5;

    //synchronized加锁，加锁后这个代码就是一根独木桥，一个时刻，只有一个线程运行
    public void run() {
        count--;
        // 格式化字符串，输出“当前线程”的线程名称
        System.out.printf("1.Welcome! I'm %s,%d.%n", Thread.currentThread().getName(), count);
    }

    /**
     * 线程执行原理：
     * 1，新建哪了一个simpleThread对象，对象有一个count属性，初始化值为5
     * 2，一共五个线程获取了这个对象，这时候拿到这个对象，做的操作是对count减一
     * 3，线程执行底层如下，CPU是多核的，CPU拿的值都是在寄存器Cache里面的，Cache里面没有则从主存里面来
     * 4，那么每个线程拿到对象，执行run方法，在多核情况下，对象在内存里面，这时候其中一个核执行线程1，另一个核执行线程2
     * 5，这两个线程的寄存中的值是主存对象count的一个副本，这时候，并发/并行执行都有可能， 那么，
     * 6，并行执行，两个拿到假如都是3，计算，打印都是2了
     * 7，假如是并发执行，那么谨慎的假设都在一个核上，那么前一个线程4，减一，打印3了，这时候没有回写主存，结合执行流水等，
     * 下一个线程，直接取寄存器中的4，减一，打印3了
     * 8.所以打印的结果是会重复的
     * 注意：这种多线程形式，是因为虚拟机中线程模型决定的，也是多线程并发很常见的情况，其中的根本原因是多核并发和CPU的计算
     * 数据只限于寄存器中，这个例子跑会打印重复的情况，但是count的值不会小于0,这个是肯定的
     */
    public static void main(String[] args) {
        /**
         * 分析：当多个线程访问SimpleThread的run方法时，以排队的方式进行处理（这里排对是按照CPU分配的先后顺序而定的），
         * 一个线程想要执行synchronized修饰的方法里的代码：
         * 	1 尝试获得锁
         * 	2 如果拿到锁，执行synchronized代码体内容；拿不到锁，这个线程就会不断的尝试获得这把锁，直到拿到为止，
         * 	而且是多个线程同时去竞争这把锁。（也就是会有锁竞争的问题）
         */
        ThreadCreate simpleThread = new ThreadCreate();

        Thread t1 = new Thread(simpleThread, "t1");
        Thread t2 = new Thread(simpleThread, "t2");
        Thread t3 = new Thread(simpleThread, "t3");
        Thread t4 = new Thread(simpleThread, "t4");
        Thread t5 = new Thread(simpleThread, "t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}












