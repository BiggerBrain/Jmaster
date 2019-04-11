package proxy_pattern.dynamic_proxy_pattern.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by dell on 2017/11/11.
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    public <T> T getProxy() {
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        //根据传入的目标返回一个代理对象
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(),
            object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = null;
        try {
            /*原对象方法调用前处理日志信息*/
            before();
            //调用目标方法
            ret = method.invoke(object, args);
            /*原对象方法调用后处理日志信息*/
            after();
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error-->>");
            throw e;
        }
    }

    public void before() {
        System.out.println("start-->>");
    }

    public void after() {
        System.out.println("success-->>");
    }
}
