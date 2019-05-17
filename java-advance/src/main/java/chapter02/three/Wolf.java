package chapter02.three;

class Animal {
    public String name;

    public void info() {
        System.out.println(name);
    }
}

// 继承Animal

/**
 * 当Wolf类继承Animal类时，编译器会直接将Animal里的void info()方法转移到Wolf类中。
 */
public class Wolf extends Animal {
    private double weight;
}
