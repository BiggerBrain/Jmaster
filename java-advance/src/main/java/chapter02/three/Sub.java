package chapter02.three;

class Base2 {
    int count = 2;
}

class Mid extends Base2 {
    int count = 20;
}

/**
 * 系统内存中并不存在Mid和Base2两个对象，程序内存中只有一个Sub对象，只是这个
 * Sub对象中不仅保存了在Sub类中定义的所有实例变量，还保存了它的所有父类所定义的全部实例变量
 */
public class Sub extends Mid {
    int count = 200;

    public static void main(String[] args) {
        // 创建一个Sub对象
        Sub s = new Sub();
        // 将Sub对象向上转型后赋为Mid，Base类型的变量
        Mid s2m = s;
        Base2 s2b = s;
        // 分别通过3个变量来访问count实例变量
        System.out.println(s.count);
        System.out.println(s2m.count);
        System.out.println(s2b.count);
    }
}
