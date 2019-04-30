package behavioral.patterns.strategy_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class FlyNotWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm can't flying");
    }
}
