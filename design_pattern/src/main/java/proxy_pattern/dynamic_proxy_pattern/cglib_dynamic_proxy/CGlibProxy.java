package proxy_pattern.dynamic_proxy_pattern.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 需要引入cglib.jar asm.jar
 * Created by dell on 2017/11/11.
 */
public class CGlibProxy implements MethodInterceptor {
    private static CGlibProxy cGlibProxy = new CGlibProxy();
    private Enhancer enhancer = new Enhancer();

    private CGlibProxy() {
    }

    public static CGlibProxy getInstance() {
        return cGlibProxy;
    }

    public <T> T getProxy(Class clazz) {
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    public void before() {
        System.out.println("start-->>");
    }

    public void after() {
        System.out.println("success-->>");
    }
}
