package chapter02.two;

/**
 * 父类构造器调用了被子类重写的方法，且通过子类构造器来创建子类对象，
 * 调用（不管是显式还是隐式）了这个父类构造器，就会导致子类的重写方法在子类构造器的所有代码执行之前被执行，
 * 从而导致子类的重写方法访问不到子类的实例变量值的清醒。
 */
class Animal {
    // desc实例变量保存对象 toString方法的返回值
    private String desc;

    public Animal() {
        // 调用getDesc()方法初始化desc实例变量
        this.desc = getDesc();
    }

    public String getDesc() {
        return "Animal";
    }

    public String toString() {
        return desc;
    }
}

public class Wolf extends Animal {
    //定义name，weight两个实例变量
    private String name;
    private double weight;

    public Wolf(String name, double weight) {
        // 默认隐试的调用父类无参构造器
        // 为name， weight两个实例变量赋值
        this.name = name;
        this.weight = weight;
    }
    // 重写父类的getDesc()方法

    public static void main(String[] args) {
        System.out.println(new Wolf("灰太狼", 32.3));
    }

    @Override
    public String getDesc() {
        return "Wolf[name=" + name + ", weight=" + weight + "]";
    }
}
