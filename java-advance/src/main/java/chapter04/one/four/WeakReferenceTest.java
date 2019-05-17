package chapter04.one.four;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {

    public static void main(String[] args) {
        // 创建一个字符串对象
        String str = new String("疯狂Java讲义");
        // 创建一个弱引用，让此引用引用到“疯狂Java讲义”字符串
        WeakReference<String> wr = new WeakReference<>(str);
        // 切断str引用和“疯狂Java讲义”字符串之间的引用
        str = null;
        // 去除弱引用所引用的对象
        System.out.println(wr.get());
        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 再次取出弱引用所引用的对象
        System.out.println(wr.get());

    }
}
