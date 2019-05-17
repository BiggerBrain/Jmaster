package chapter07.one;

public class NullInstanceof {
    public static void main(String[] args) {
        String s = null;
        System.out.println("null是否是String类的实例：" + (s instanceof String));
    }
}
