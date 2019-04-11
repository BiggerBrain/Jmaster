package proxy_pattern.dynamic_proxy_pattern.jdk_dynamic_proxy;

/**
 * Created by dell on 2017/11/11.
 */
public class Test {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy(new RealSubject());
        Subject subject = dynamicProxy.getProxy();
        subject.say();
        int sum = subject.sum(5, 9);
        System.out.println(sum);
    }
}
