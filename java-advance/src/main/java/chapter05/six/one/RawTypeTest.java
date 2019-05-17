package chapter05.six.one;

import java.util.ArrayList;
import java.util.List;

public class RawTypeTest {
    public static void main(String[] args) {
        // 创建一个RawType的List集合
        List list = new ArrayList();
        list.add("疯狂Java讲义");
        list.add("轻量级Java EE企业应用实战");
        list.add("疯狂Ajax讲义");
        // 将原始类型的list集合赋给带泛型生命的List集合
        List<Integer> intList = list;
        // 遍历intList集合的每个元素
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
