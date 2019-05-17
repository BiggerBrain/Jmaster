package chapter05.two.two;

/**
 * 复合运算的隐式类型转换
 */
public class CompositeAssign {
    public static void main(String[] args) {
        short st = 5;
        // 没有任何问题，系统执行隐式的类型转换
        st += 10;
        System.out.println(st);
        // 此时有问题了，因为系统有一个隐式的类型转换，将会发生“溢出”
        st += 90000;
        System.out.println(st);
        System.out.println(Short.MAX_VALUE);
    }
}
