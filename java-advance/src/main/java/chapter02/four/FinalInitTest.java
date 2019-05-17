package chapter02.four;

public class FinalInitTest {

    // 定义3个final实例变量
    final String str1;
    final String str2;
    final String str3 = "Java";

    // str1、str2分别放在非静态初始化块、构造器中初始化
    {
        str1 = "Java";
    }

    public FinalInitTest() {
        str2 = "Java";
    }

    /**
     * 对于实例变量而言，除了可以在定义该变量时赋初始值之外，还可以在非静态初始化块、构造器
     * 中对它赋初始值，而且在这3个地方指定初始值的效果基本一样
     * <p>
     * 但是对于final实例变量而言，只有在定义该变量时指定初始值才会有“宏变量”的效果，
     * 在非静态初始化块、构造器中为final实例变量指定初始值则不会有这种效果
     *
     * @param args
     */
    public static void main(String[] args) {
        FinalInitTest fit = new FinalInitTest();
        fit.display();
    }

    // 判断str1、str2、str3是否执行“宏替换”
    public void display() {
        System.out.println(str1 + str1 == "JavaJava");
        System.out.println(str2 + str2 == "JavaJava");
        // 相当于System.out.println("Java" + "Java" == "JavaJava");
        System.out.println(str3 + str3 == "JavaJava");
    }

}
