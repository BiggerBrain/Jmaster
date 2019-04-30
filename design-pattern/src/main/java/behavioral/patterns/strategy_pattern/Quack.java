package behavioral.patterns.strategy_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("gua gua gua");
    }
}
