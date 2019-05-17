package chapter02.four.three;

class Base {
    private final void info() {
        System.out.println("Base 的info 方法");
    }
}

public class FinalMethodTest extends Base {

    // 这个info方法并不是覆盖父类方法
//    @Override
    public void info() {
        System.out.println("FinalMethodTest的Info方法");
    }
}
