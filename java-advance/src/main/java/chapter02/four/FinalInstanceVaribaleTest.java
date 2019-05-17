package chapter02.four;

public class FinalInstanceVaribaleTest {
    // 定义final实例变量时赋初始值
    final int var1 = "疯狂Java讲义".length();
    final int var2;
    final int var3;

    // 在初始化块中为var2赋初始值
    {
        var2 = "轻量级Java EE企业应用实战".length();
    }

    // 在构造器中为var3赋初始值
    public FinalInstanceVaribaleTest() {
        this.var3 = "疯狂XML讲义".length();
    }

    public static void main(String[] args) {
        FinalInstanceVaribaleTest fiv = new FinalInstanceVaribaleTest();
        System.out.println(fiv.var1);
        System.out.println(fiv.var2);
        System.out.println(fiv.var3);
    }
}
