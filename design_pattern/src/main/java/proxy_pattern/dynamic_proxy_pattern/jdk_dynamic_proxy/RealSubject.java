package proxy_pattern.dynamic_proxy_pattern.jdk_dynamic_proxy;

/**
 * Created by dell on 2017/11/11.
 */
public class RealSubject implements Subject {
    @Override
    public void say() {
        System.out.println("i'm a RealSubject");
    }

    @Override
    public int sum(int i, int d) {
        return i + d;
    }
}
