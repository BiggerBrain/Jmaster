package base.synchronize;
/**
 * synchronized异常，出现异常会释放锁
 * @author lishixiong
 *
 */
public class SynchronizeException {

	private int i = 0;
	public synchronized void operation(){
		while(true){
			try {
				i++;
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + " , i = " + i);
				if(i == 20){
					//Integer.parseInt("a");
					throw new RuntimeException();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		final SynchronizeException se = new SynchronizeException();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				se.operation();
			}
		},"t1");
		t1.start();
	}
	
	
}
