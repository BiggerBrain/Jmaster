package chapter02.three;

class Base {
    int count = 2;

    public void display() {
        System.out.println(this.count);
    }
}

class Derived extends Base {
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}

public class FieldAndMethodTest {
    /**
     * java 继承在处理成员变量和方法时是有区别的
     *
     * @param args
     */
    public static void main(String[] args) {
        // 声明并创建一个Base对象
        Base b = new Base();
        // 直接访问count实例变量和通过display访问count实例变量
        System.out.println(b.count);// 2
        b.display();// 2
        // 声明并创建一个Derived对象
        Derived d = new Derived();
        // 直接访问count实例变量和通过display访问count实例变量
        System.out.println(d.count);// 20
        d.display();// 20
        // 声明一个Base变量，并将Derived对象赋给该变量
        Base bd = new Derived();
        // 直接访问count实例变量和通过display访问count实例变量
        /*
         * 将输出声明时类型
         */
        System.out.println(bd.count);// 2
        /*
         * 将输出运行时类型
         */
        bd.display();// 20
        // 让d2b变量指向原d变量所指向的Derveid对象
        Base d2b = d;
        // 访问d2b所指对象的count实例变量
        System.out.println(d2b.count);// 2
    }

}
