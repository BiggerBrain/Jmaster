package structural.patterns.adapter;

/**
 * @author lishixiong
 * @date 2019/4/16 0016 16:21
 * 适配器模式是作为两个不兼容的接口之间的桥梁，适配器模式结合了两个独立接口的功能。
 * 这种类型的设计模式属于结构型模式。
 */
public class AppMain {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.Request();
    }
}
