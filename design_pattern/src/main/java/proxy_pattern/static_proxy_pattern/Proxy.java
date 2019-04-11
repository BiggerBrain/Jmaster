package proxy_pattern.static_proxy_pattern;


/**
 * Created by dell on 2017/11/11.
 */
public class Proxy implements Subject {
    Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void say() {
        System.out.println("i'm a proxy before");
        subject.say();
        System.out.println("i'm a proxy after");
    }
}
