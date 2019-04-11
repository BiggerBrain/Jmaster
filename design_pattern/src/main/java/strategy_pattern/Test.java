package strategy_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class Test {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.setFlyBehavior(new FlyNotWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.proxyFly();
        modelDuck.proxyQuack();
        modelDuck.swim();


        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.setFlyBehavior(new FlyRocketWithPower());
        decoyDuck.setQuackBehavior(new Quack());
        decoyDuck.proxyFly();
        decoyDuck.proxyQuack();
        decoyDuck.swim();
    }
}
