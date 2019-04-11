package proxy_pattern.static_proxy_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.say();
    }
}
