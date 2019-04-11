package single_pattern.inner_class_singleton;

/**
 * Created by dell on 2017/11/10.
 */
public class InnerSingleton {
    private InnerSingleton() {
    }

    public static InnerSingleton getInstance() {
        return singleton.single;
    }

    public void say() {
        System.out.println("i'm InnerSingleton!!!");
    }

    private static class singleton {
        private static InnerSingleton single = new InnerSingleton();
    }
}
