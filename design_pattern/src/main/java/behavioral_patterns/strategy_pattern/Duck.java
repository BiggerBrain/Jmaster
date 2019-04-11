package behavioral_patterns.strategy_pattern;

/**
 * Created by dell on 2017/11/9.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void proxyQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void proxyFly() {
        flyBehavior.fly();
    }

    ;

    public void swim() {
        System.out.println("a duck was swim !!!");
    }
}
