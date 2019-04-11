package proxy_pattern.dynamic_proxy_pattern.cglib_dynamic_proxy;

/**
 * Created by dell on 2017/11/11.
 */
public class RealSubject {
    public void say() {
        System.out.println("i'm a RealSubject");
    }

    public int sum(int i, int d) {
        return i + d;
    }
}
