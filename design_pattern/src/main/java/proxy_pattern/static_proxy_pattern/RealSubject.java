package proxy_pattern.static_proxy_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class RealSubject implements Subject {
    @Override
    public void say() {
        System.out.println("i'm a RealSubject");
    }
}
