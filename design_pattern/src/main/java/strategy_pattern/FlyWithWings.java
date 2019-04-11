package strategy_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying");
    }
}
