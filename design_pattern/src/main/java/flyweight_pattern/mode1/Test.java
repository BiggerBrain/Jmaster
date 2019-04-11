package flyweight_pattern.mode1;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {

        //单一测试，支持多线程
        FlyWeightFactory.setFlyWeight("nihao");
        FlyWeightFactory.setFlyWeight("goodLuck");
        System.out.println(FlyWeightFactory.allFlyWeight.size());
        FlyWeight flyWeight = FlyWeightFactory.getFlyWeight("nihao");
        flyWeight.action("bye bye");

        //可以用多线程的方式测试
    }
}
