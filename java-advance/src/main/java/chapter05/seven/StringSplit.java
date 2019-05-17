package chapter05.seven;

public class StringSplit {
    /**
     * 正则表达式中的(.)可匹配任意字符
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "java.is.funny.www.crazyit.org";
        // 将这个字符串以点好(.)分隔成多个字符
//        String[] strArr = str.split(".");
        String[] strArr = str.split("\\.");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
