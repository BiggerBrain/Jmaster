package chapter07.two.two;

class Dog implements Cloneable {
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // 重写Object类的clone方法
    public Object clone() {
        Dog dog = null;
        try {
            // 调用Object类的clone方法完成复制
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (Double.compare(dog.weight, weight) != 0) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 17 + (int) weight;
    }
}

public class CloneTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Bolt", 9.8);
        System.out.println("Dog对象创建完成");
        // 采用clone()方法复制一个新的Java对象
        Dog dog2 = (Dog) dog.clone();
        //两个对象的实例变量值完全相同，下面输出true
        System.out.println(dog.equals(dog2));
        // 两个对象不相同，下面输出false
        System.out.println(dog == dog2);
    }
}
