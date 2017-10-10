package base.synchronize;
/**
 * synchronized的重入,父子继承关系的锁重入问题
 * 情景：
 * 我们有一个父类，一个子类，父类一个方法fatherSay()用synchronize修饰，子类也有一个方法sonSay()用synchronize修饰，这时候，
 * 用子类定义一个对象，子类调用sonSay()方法，里面再调用fatherSay()，这时候是可以重入的,这是可重入的另一种形式。
 * 本质：
 * 可重入的本质，不在调用，而在于线程，简单而言，对于一个临界资源，具体点，也就是用synchronize修饰的方法，静态或动态都可以，
 * 这些资源的竞争是公平的，但是一个线程如果竞争成功后，那么这个线程可以再去竞争这个资源，在上锁。
 *
 * 为什么要可以重入：
 *     因为防止死锁，因为在业务场景中，有这样的情况，再HashTable中，putALL(),put()方法都是上了synchronize的，如果不重入，那么
 * putALl，put了一个，那么就阻塞了，所以需要可重入。
 *
 * 有没有不可重入的锁？
 * CAS便是不可以重入的锁！
 * @author lishixiong
 *
 */
public class ReentrantSyncExtend {

	static class Father {
		public   int i = 10;
		//可以添加static
		public  synchronized void fatherSay(){
			try {
				i--;
				System.out.println("Father print i = " + i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	static class Son extends Father {
		public  synchronized void sonSay(){
			try {
				while(i > 0) {
					i--;
					System.out.println("Son print i = " + i);
					Thread.sleep(100);		
					fatherSay();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Son son = new Son();
				son.sonSay();
			}
		});
		
		t1.start();
	}
	
	
}
