package chapter05.six.two;

import java.util.ArrayList;
import java.util.List;

class Apple2<T extends Number> {
    T size;

    public Apple2() {
    }

    public Apple2(T size) {
        this.size = size;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public List<String> getApples() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Apple2<>(10 * i).toString());
        }
        return list;
    }

    @Override
    public String toString() {
        return "Apple2{" +
            "size=" + size +
            '}';
    }
}

public class ErasureTest2 {

    public static void main(String[] args) {
        Apple2<Integer> a = new Apple2<>(6);
        for (String apple : a.getApples()) {
            System.out.println(apple);
        }
        // 将a变量赋给一个没有泛型声明的变量
        // 系统将擦除所有泛型信息，也就是擦除所有尖括号里的信息
        // 也就是说，b对象调用getAppleSizes()方法不再返回List<String>
        // 而是返回List
        Apple2 b = a;
        // 编译出错
        /*for (String apple : b.getApples()) {
            System.out.println(apple);
        }*/
    }
}
