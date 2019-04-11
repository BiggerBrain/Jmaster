package proxy_pattern.dynamic_proxy_pattern.cglib_dynamic_proxy;

/**
 * Created by dell on 2017/11/11.
 */
public class Test {
    public static void main(String[] args) {
        RealSubject realSubject = CGlibProxy.getInstance().getProxy(RealSubject.class);
        realSubject.say();
    }
}
