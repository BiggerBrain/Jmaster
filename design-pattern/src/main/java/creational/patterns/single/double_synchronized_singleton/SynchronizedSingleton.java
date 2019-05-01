package creational.patterns.single.double_synchronized_singleton;

/**
 * Created by dell on 2017/11/10.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton() {
    }

    public static SynchronizedSingleton getInstance() {
        if (synchronizedSingleton == null) {
            // 这是类锁，在对象中只有一份
            synchronized (SynchronizedSingleton.class) {
                if (synchronizedSingleton == null) {
                    synchronizedSingleton = new SynchronizedSingleton();
                }
            }
        }
        return synchronizedSingleton;
    }

    public void say() {
        System.out.println("i'm SynchronizedSingleton!!!");
    }
}
