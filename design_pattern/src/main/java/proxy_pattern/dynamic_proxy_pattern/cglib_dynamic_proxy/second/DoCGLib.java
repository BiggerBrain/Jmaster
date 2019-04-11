package proxy_pattern.dynamic_proxy_pattern.cglib_dynamic_proxy.second;

/**
 * Created by dell on 2017/11/11.
 */
public class DoCGLib {
    public static void main(String[] args) {
        CgSlibProxy proxy = new CgSlibProxy();
        //通过生成子类的方式创建代理类
        SayHello proxyImp = (SayHello) proxy.getProxy(SayHello.class);
        proxyImp.say();
    }
}
