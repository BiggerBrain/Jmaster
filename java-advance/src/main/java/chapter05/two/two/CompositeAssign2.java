package chapter05.two.two;

/**
 * 复合运算的隐式类型转换
 */
public class CompositeAssign2 {
    public static void main(String[] args) {
        // 定义两个字符串
        Object he = new CompositeAssign2();
        String crazy = "crazyit.org ,";
        // 因为+=左边变量的类型是String，所以下面语句是正确的
        // he 将自动转换为String（也就是使用它的toString()返回至）
        crazy += he;
        System.out.println(crazy);
        // 因为+=左边变量的类型不是String类型，所以下面语句是错误的
        he += crazy;
        System.out.println(he);
    }
}
