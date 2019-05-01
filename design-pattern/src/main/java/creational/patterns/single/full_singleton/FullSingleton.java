package creational.patterns.single.full_singleton;

/**
 * Created by dell on 2017/11/10.
 */
public class FullSingleton {
    private static FullSingleton fullSingleton;

    private FullSingleton() {
    }

    public static FullSingleton getInstance() {
        if (fullSingleton == null) {
            fullSingleton = new FullSingleton();
        }
        return fullSingleton;
    }

    public void say() {
        System.out.println("i'm fullSingleton!!!");
    }
}
