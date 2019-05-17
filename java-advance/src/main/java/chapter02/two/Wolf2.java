package chapter02.two;

class Animal2 {

    public String getDesc() {
        return "Animal";
    }

    public String toString() {
        return getDesc();
    }
}

public class Wolf2 extends Animal2 {
    //定义name，weight两个实例变量
    private String name;
    private double weight;

    public Wolf2(String name, double weight) {
        // 默认隐试的调用父类无参构造器
        // 为name， weight两个实例变量赋值
        this.name = name;
        this.weight = weight;
    }
    // 重写父类的getDesc()方法

    public static void main(String[] args) {
        System.out.println(new Wolf2("灰太狼", 32.3));
    }

    @Override
    public String getDesc() {
        return "Wolf[name=" + name + ", weight=" + weight + "]";
    }
}

