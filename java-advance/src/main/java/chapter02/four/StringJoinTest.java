package chapter02.four;

public class StringJoinTest {

    public static void main(String[] args) {
        String s1 = "疯狂Java";
        String s2 = "疯狂" + "Java";
        System.out.println(s1 == s2);
        // 定义2个字符串直接量
        String str1 = "疯狂";
        String str2 = "Java";
        // 将str1和str2进行连接运算
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
    }

}
