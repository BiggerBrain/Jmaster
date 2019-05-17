package chapter02.four;

public class FinalStaticTest {
    // 定义2个final类变量
    final static String str1;
    final static String str2 = "Java";

    // 将str1放在静态初始化块中初始化
    static {
        str1 = "Java";
    }

    /**
     * 对于普通类变量，在定义时初始值、在静态初始化块中赋初始值的效果基本一样
     * <p>
     * 但是对于final类变量而言，只有在定义final类变量时指定初始值，系统才会对该final类变量执行“宏替换”
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(str1 + str1 == "JavaJava");
        System.out.println(str2 + str2 == "JavaJava");
    }
}
