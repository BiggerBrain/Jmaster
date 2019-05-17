package chapter02.four;

class Price {
    // 类成员是Price实例
    final static Price INSTANCE = new Price(2.8);
    // 再定义一个类变量
    final static double initPrice = 20;
    // 定义该Price的currentPrice实例变量
    double currentPrice;

    public Price(double discount) {
        // 根据静态变量计算实例变量
        currentPrice = initPrice - discount;
    }
}

public class PriceTest {
    public static void main(String[] args) {
        // 通过Price的INSTANCE访问currentPrice实例变量
        System.out.println(Price.INSTANCE.currentPrice);
        // 显示创建Price实例
        Price p = new Price(2.8);
        // 通过显示创建的Price实例访问currentPrice实例变量
        System.out.println(p.currentPrice);
    }

}
