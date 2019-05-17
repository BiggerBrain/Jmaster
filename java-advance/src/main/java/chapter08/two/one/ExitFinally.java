package chapter08.two.one;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExitFinally {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("a.bin");
            System.out.println("程序打开物理资源");
            /*
             * 执行系统中注册的所有关闭钩子
             * 如果程序调用了System.runFinalizerOnExit(true);那么JVM会对所有还未结束的对象调用Finalizer
             */
            System.exit(0);
        } finally {
            //使用finally块关闭资源
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("程序关闭了物理资源！");
        }
    }
}
