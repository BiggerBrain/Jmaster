package chapter02.four;

/**
 * final修饰符的一个重要用途就是定义“宏变量”，当定义final变量时就为该变量指定了初始值，
 * 而且该初始值可以在编译时就确定下来，那这个final变量本质上就是一个“宏变量”，编译器会把程序
 * 中所有用到该变量的地方直接替换成该变量的值
 */
public class FinalLocalTest {
    /**
     * javap -c FinalLocalTest
     * <p>
     * 如果没有使用final修饰变量a，系统会把它当成一个变量处理。但是如果使用final修饰它，
     * 在此编译产生对应的Test.class文件，然后使用javap来分析它将看到如下输出
     *
     * @param args
     */
    public static void main(String[] args) {
        // 定义一个普通局部变量
        int a = 5;
        System.out.println(a);
    }
}
