package chapter02.two;

public class StaticInitTest {
    // 定义count类变量，定义时指定初始值
    static int count = 2;
    // 定义name类变量时指定初始值
    static String name = "疯狂Java讲义";

    // 通过静态初始化块为name类变量指定初始值
    static {
        System.out.println("StaticInitTest 的静态初始化块");
        name = "Java编程";
    }

    public static void main(String[] args) {
        // 访问该类的两的两个类变量
        System.out.println("count类变量的值：" + StaticInitTest.count);
        System.out.println("name类变量的值：" + StaticInitTest.name);
    }
}
