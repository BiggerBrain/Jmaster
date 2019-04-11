package strategy_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<slice slice>");
    }
}
