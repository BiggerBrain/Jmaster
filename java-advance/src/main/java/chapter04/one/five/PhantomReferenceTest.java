package chapter04.one.five;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

    public static void main(String[] args) {
        // 创建一个字符串对象
        String str = new String("疯狂Java讲义");
        // 创建一个引用队列
        ReferenceQueue<String> rq = new ReferenceQueue<>();
        // 创建一个虚引用，让此虚引用引用到"疯狂Java讲义"字符串
        PhantomReference<String> pr = new PhantomReference<>(str, rq);

        System.out.println(pr.get());

        // 切断str引用和"疯狂Java讲义"字符串之间的引用
        str = null;
        // 试图去除虚引用所引用的对象
        // 程序并不能通过虚引用访问被引用的对象，所以此处输出null
        System.out.println(pr.get());

        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 取出引用队列中最先进入队列中引用与pr进行比较
        System.out.println(rq.poll() == pr);
    }
}
