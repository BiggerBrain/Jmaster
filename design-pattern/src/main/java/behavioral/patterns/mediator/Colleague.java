
package behavioral.patterns.mediator;

/**
 * @author lishixiong
 * @version 1.0: Colleague.java, v 0.1 2019年05月08日 16:02 lishixiong Exp $
 */
public class Colleague {
    //同事类需要与其他同事类进行交互的，就交给中介者来处理。
    protected Mediator mediator;
    protected String name;

    public Colleague(String name, Mediator mediator) {
        this.mediator = mediator;
        this.name = name;
    }
}