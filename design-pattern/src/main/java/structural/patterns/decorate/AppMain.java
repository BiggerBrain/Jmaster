package structural.patterns.decorate;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.opreation();
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.opreation();
    }
}
