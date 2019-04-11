package adapter_pattern.class_adapter_pattern;

/**
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 * Created by dell on 2017/11/11.
 */
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
