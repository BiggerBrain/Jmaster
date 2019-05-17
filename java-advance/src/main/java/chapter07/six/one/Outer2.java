package chapter07.six.one;

/**
 * 非静态内部类必须寄生在外部类的实例中，如果没有外部类的对象，就不可能产生非静态内部类的对象。
 * 因此，非静态内部类不可能有无参数的构造器---即使系统为非静态内部类提供一个默认的构造器，这个默认的构造器也需要一个外部类形参
 * <p>
 * <p>
 * 非静态内部类的构造器的第一个形参类型总是外部类
 */
public class Outer2 {

    public static void main(String[] args) throws Exception {
        new Outer2().test();
    }

    private void test() throws IllegalAccessException, InstantiationException {
        // 创建非静态内部类的对象
        System.out.println(new Inner());
        // 使用反射方式来创建Inner对象
        System.out.println(Inner.class.newInstance());
    }

    // 定义一个非静态内部类
    private class Inner {

        public Inner() {
            System.out.println("Inner无参数的构造器");
        }

        public Inner(String name) {
            System.out.println("Inner构造器的：" + name);
        }

        public String toString() {
            return "Inner对象";
        }
    }
}
