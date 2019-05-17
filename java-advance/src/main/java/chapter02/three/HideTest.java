package chapter02.three;

class Parent {
    public String tag = "疯狂Java讲义";
}

class Derived2 extends Parent {
    // 定义一个私有的tag实例变量来隐藏父类的tag实例变量
    public String tag = "轻量级Java EE企业应用实战";
}

public class HideTest {

    public static void main(String[] args) {
        Derived2 d = new Derived2();
        // 程序不可访问d的私有变量:tag，所以下面语句将引起编译错误
//        System.out.println(d.tag);
        // 将d变量显式地向上转型为Parent后，即可访问tag实例变量
        // 程序将输出：“疯狂Java讲义”
        System.out.println(((Parent) d).tag);
    }

}
