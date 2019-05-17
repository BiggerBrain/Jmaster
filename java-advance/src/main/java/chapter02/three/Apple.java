package chapter02.three;

class Fruit {
    String color = "未确定颜色";

    // 定义一个方法，该方法返回调用该方法的实例
    public Fruit getThis() {
        return this;
    }

    public void info() {
        System.out.println("Fruit 方法");
    }
}

public class Apple extends Fruit {
    String color = "红色";

    public static void main(String[] args) {
        // 创建一个Apple对象
        Apple a = new Apple();
        // 调用getSuper()方法获取Apple对象关联的super引用
        Fruit f = a.getSuper();
        // 判断a和f的关系
        System.out.println("a和f所引用的对象是否是相同：" + (a == f));
        System.out.println("访问a所引用对象的color实例变量：" + a.color);
        System.out.println("访问f所引用对象的color实例变量：" + f.color);
        // 分别通过a、f两个变量来调用info方法
        a.info();
        f.info();
        // 调用AccessSuperInfo来调用父类的info()方法
        a.AccessSuperInfo();
    }

    // 重写父类的方法
    @Override
    public void info() {
        System.out.println("Apple 方法");
    }

    // 通过super调用父类的Info()方法
    public void AccessSuperInfo() {
        super.info();
    }

    // 尝试返回super关键字代表的内容
    public Fruit getSuper() {
        return super.getThis();
    }
}
