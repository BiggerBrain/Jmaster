package chapter03.two.one;

import java.util.HashMap;
import java.util.TreeMap;

public class MapValueTest {

    public static void main(String[] args) {
        HashMap<String, Double> scores = new HashMap<>();
        scores.put("语文", 89.0);
        scores.put("数学", 83.0);
        scores.put("英文", 80.0);
        // 输出scores集合的values()方法返回值
        System.out.println(scores.values());
        System.out.println(scores.values().getClass());

        TreeMap<String, Double> health = new TreeMap<>();
        health.put("身高", 173.0);
        health.put("体重", 71.2);
        // 输出health集合的values()方法返回值
        System.out.println(health.values());
        System.out.println(health.values().getClass());
    }

}
