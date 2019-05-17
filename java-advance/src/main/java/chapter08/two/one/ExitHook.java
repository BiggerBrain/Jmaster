package chapter08.two.one;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 正常关闭物理资源
 */
public class ExitHook {
    public static void main(String[] args) throws IOException {
        final FileOutputStream fos;
        fos = new FileOutputStream("a.bin");
        System.out.println("程序打开物理资源");
        // 为系统注册关闭钩子
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // 使用关闭钩子
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("程序关闭了物理资源");
            }
        });
        // 退出程序
        System.exit(0);
    }
}
