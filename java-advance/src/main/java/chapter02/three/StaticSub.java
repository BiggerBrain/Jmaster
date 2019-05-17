package chapter02.three;

class StaticBase {
    // 定义一个count类变量
    static int count = 20;
}

public class StaticSub extends StaticBase {
    // 子类再定义一个count类变量
    static int count = 200;

    public static void main(String[] args) {
        StaticSub sb = new StaticSub();
        sb.info();
    }

    public void info() {
        System.out.println("访问本来的count类变量：" + count);
        System.out.println("访问父类的count类变量：" + StaticBase.count);
        System.out.println("访问父类的count类变量：" + super.count);
    }
}
