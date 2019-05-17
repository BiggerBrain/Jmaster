package chapter03.one.one;

public class Set2MapTest {
    public static void main(String[] args) {
        Set2Map<String, Integer> scores = new Set2Map<>();
        // 将key-value对放入集合
        scores.put("语文", 89);
        scores.put("数学", 83);
        scores.put("英文", 80);
        System.out.println(scores);
        // 访问Map集合里包含的key-value对
        System.out.println(scores.size());
        scores.removeEntry("数学");
        System.out.println("删除key为\"数学\"的Entry之后：" + scores);
        // 根据key取出value
        System.out.println("语文成绩：" + scores.get("语文"));
        // 判断是否包含指定key
        System.out.println("是否包含\"英语\"key:" + scores.containsKey("英语"));
        // 判断是否包含指定value
        System.out.println("是否包含82 value:" + scores.containsValue(82));
        // 清空集合
        scores.clear();
        System.out.println("执行clear()方法之后的集合：" + scores);
    }
}
