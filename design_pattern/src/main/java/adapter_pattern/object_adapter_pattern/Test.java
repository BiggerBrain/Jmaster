package adapter_pattern.object_adapter_pattern;

/**
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper(TurkeyAdapter)类，持有原类的一个实例(比如说在TurkeyAdapter中持有Turkey实例),
 * 在Wrapper类的方法中，调用实例的方法就行。
 * Created by dell on 2017/11/11.
 */
public class Test {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.display();
        turkeyAdapter.fly();
    }
}
