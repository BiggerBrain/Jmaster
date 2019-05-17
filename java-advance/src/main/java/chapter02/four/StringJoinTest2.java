package chapter02.four;

public class StringJoinTest2 {

    public static void main(String[] args) {
        String s1 = "疯狂Java";
        String s2 = "疯狂" + "Java";
        System.out.println(s1 == s2);
        // 定义2个字符串直接量
        /*
         * 因为是final的变量，执行了宏替换
         */
        final String str1 = "疯狂";
        final String str2 = "Java";
        // 将str1和str2进行连接运算
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
    }

}
