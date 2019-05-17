package chapter07.two.two;

import java.io.*;

class Wolf implements Serializable {
    private String name;

    public Wolf(String name) {
        System.out.println("调用有参数的构造器");
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() == o.getClass()) {
            Wolf target = (Wolf) o;
            return target.name.equals(this.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

public class SerializableTest {
    public static void main(String[] args) throws Exception {
        Wolf w = new Wolf("灰太狼");
        System.out.println("Wolf对象创建完成~");
        Wolf w2 = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            // 创建对象输出流
            oos = new ObjectOutputStream(new FileOutputStream("a.bin"));
            // 创建对象输入流
            ois = new ObjectInputStream(new FileInputStream("a.bin"));
            // 序列化输出Java对象
            oos.writeObject(w);
            oos.flush();
            // 反序列化恢复Java对象
            w2 = (Wolf) ois.readObject();
            // 两个对象的实例变量值完全相等，下面输出true
            System.out.println(w.equals(w2));
            System.out.println(w == w2);
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (ois != null) {
                ois.close();
            }
        }
    }
}
