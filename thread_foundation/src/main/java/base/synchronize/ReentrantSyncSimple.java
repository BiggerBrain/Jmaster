package base.synchronize;

/**
 * synchronized的重入
 * 注意到下面的方法1到3都有synchronized修饰，而且是对一个类的对象进行设置，然后嵌套调用，打印：
 * method1..
 * method2..
 * method3..
 * 说明synchronized是可以重入的
 * 重入的意思：
 *
 * 当线程请求一个由其它线程持有的对象锁时，该线程会阻塞，而当线程请求由自己持有的对象锁时，如果该锁是重入锁,请求就会成功,否则阻塞。
 *
 * 重入的细节：
 * java中获取锁的操作的粒度是“线程”，而不是“调用”，即不是每一次调用都是建立一个锁。
 * 重入锁的一种实现方法是为每个锁关联一个线程持有者和计数器，当计数器为0时表示该锁没有被任何线程持有，
 * 那么任何线程都可能获得该锁而调用相应的方法；当某一线程请求成功后，JVM会记下锁的持有线程，并且将计数器置为1；
 * 此时其它线程请求该锁，则必须等待；而如果同一个线程再次请求这个锁，就可以再次拿到这个锁，同时计数器会递增；
 * 当线程退出同步代码块时，计数器会递减，如果计数器为0，则释放该锁。
 *
 * @author lishixiong
 *
 */
public class ReentrantSyncSimple {

	public  synchronized void method1(){
		System.out
            .println("method1..");
		method2();

	}
	public  synchronized void method2(){
		System.out.println("method2..");
		method3();
	}
	public  synchronized void method3(){
		System.out.println("method3..");
	}
	public static void main(String[] args) {
		final ReentrantSyncSimple sd = new ReentrantSyncSimple();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				sd.method1();
			}
		});
		t1.start();
	}
}
