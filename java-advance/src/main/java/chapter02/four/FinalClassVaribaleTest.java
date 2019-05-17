package chapter02.four;

public class FinalClassVaribaleTest {
    // 定义final类变量时赋初始值
    final static int var1 = "疯狂Java讲义".length();
    final static int var2;

    // 在静态初始化块中var2赋初始值
    static {
        var2 = "轻量级Java EE企业应用实战".length();
    }

    public static void main(String[] args) {
        System.out.println(FinalClassVaribaleTest.var1);
        System.out.println(FinalClassVaribaleTest.var2);
    }
}
