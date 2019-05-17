package chapter03.one.two;


import java.util.ArrayList;
import java.util.List;

class Apple {
    double weight;

    public Apple(double weight) {
        this.weight = weight;
    }
}

public class ListTest {
    public static void main(String[] args) {
        // 创建2个Apple对象
        Apple t1 = new Apple(2.2);
        Apple t2 = new Apple(1.8);
        List<Apple> list = new ArrayList<>(4);
        // 将2个Apple对象放入集合中
        list.add(t1);
        list.add(t2);

        // 判断从集合里取出的引用变量和原有引用变量是否指向同一个元素
        System.out.println(list.get(0) == t1);
        System.out.println(list.get(1) == t2);
    }
}
