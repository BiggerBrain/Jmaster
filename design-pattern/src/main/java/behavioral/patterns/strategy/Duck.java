package behavioral.patterns.strategy;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/9.
 */
@Log4j2
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
        log.info("a duck was swim !!!");
    }
}
