package chapter02.two;

/**
 * 1.编译成一个class文件
 * 2.执行命令javap -c JavaToolTest
 */
class Cat {
    // 定义name,age两个实例变量
    String name;
    int age;
    // 定义时指定初始值
    // 定义变量时指定的初始值和初始化中指定的初始值，与它们在源程序中的排列顺序相同
    // 将以下一行代码挪至{}代码块上，执行结果完全不同
    double weight = 2.3;

    // 定义时指定初始值
//        double weight = 2.3;

    // 在构造器之前执行
    {
        System.out.println("执行非静态初始化块");
        // 被定义时指定初始化值覆盖
        weight = 2.0;
    }

    // 使用构造器初始化name、age两个实例变量
    public Cat(String name, int age) {
        System.out.println("执行构造器");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", weight=" + weight +
            '}';
    }
}

public class InitTest {
    public static void main(String[] args) {
        Cat cat = new Cat("kitty", 2);
        System.out.println(cat);
        Cat cat2 = new Cat("Jerfield", 3);
        System.out.println(cat2);
    }
}
