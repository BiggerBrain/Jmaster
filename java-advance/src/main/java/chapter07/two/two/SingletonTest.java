package chapter07.two.two;

import java.io.*;

class Singleton implements Serializable {
    private static Singleton instance;
    private String name;

    private Singleton(String name) {
        System.out.println("调用有参数的构造器");
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        // 只有当instance为null时才创建该对象
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }

    // 提供readResolve()方法
    private Object readResolve() throws ObjectStreamException {
        // 得到已有的instance实例
        return instance;
    }
}

public class SingletonTest {
    public static void main(String[] args) throws Exception {
        //调用静态方法来获取Wolf实例
        Singleton s = Singleton.getInstance("灰太狼");
        System.out.println("Wolf对象创建完成~");
        Singleton s2 = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            // 创建对象输出流
            oos = new ObjectOutputStream(new FileOutputStream("b.bin"));
            ois = new ObjectInputStream(new FileInputStream("b.bin"));
            // 序列化输出Java对象
            oos.writeObject(s);
            oos.flush();
            // 反序列化恢复Java对象
            s2 = (Singleton) ois.readObject();
            // 两个对象相同，下面输出true
            System.out.println(s == s2);
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
