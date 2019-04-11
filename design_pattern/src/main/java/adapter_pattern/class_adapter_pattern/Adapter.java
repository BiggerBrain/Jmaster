package adapter_pattern.class_adapter_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class Adapter extends Source implements Target {
    @Override
    public void method2() {
        System.out.println("i'm a Target method2");
    }
}
