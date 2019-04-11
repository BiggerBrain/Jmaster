package adapter_pattern.object_adapter_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class GreenHeadDuck implements Duck {
    @Override
    public void display() {
        System.out.println("this is a GreenHeadDuck");
    }

    @Override
    public void fly() {
        System.out.println("i'm fly now,like a normal duck");
    }
}
