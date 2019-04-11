package single_pattern.hunger_singleton;

/**
 * Created by dell on 2017/11/10.
 */
public class HungerSingleton {
    private static HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }

    public void say() {
        System.out.println("i'm HungerSingleton!!!");
    }
}
