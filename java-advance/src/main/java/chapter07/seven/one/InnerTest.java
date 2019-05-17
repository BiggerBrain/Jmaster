package chapter07.seven.one;

class Outer {
    private static int staticField = 20;
    private String name;

    public static class Inner {
        public void info() {
            // 分别访问外部类中静态的field和非静态的field
            System.out.println("外部类的staticField为：" + staticField);
//            System.out.println("外部类的name为：" + name);
        }
    }
}

/**
 * 静态内部类不能访问外部类的非静态成员
 */
public class InnerTest {
    // 声明并创建Inner内部类的实例
    Outer.Inner in = new Outer.Inner();
//    in.info();
}
