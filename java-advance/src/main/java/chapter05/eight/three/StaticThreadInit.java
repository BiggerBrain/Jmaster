package chapter05.eight.three;

public class StaticThreadInit {
    // 2.为website field分配内存空间
    // 定义一个静态field，设置其初始值为www.crazyit.org
    static String website = "www.crazyit.org";

    // 3.执行静态初始化块
    static {
        // 创建匿名内部类来启动新线程
        Thread t = new Thread() {
            // 启动新线程将website属性设置为www.leegang.org
            public void run() {
                // 4.执行打印操作
                System.out.println("进入run方法");
                // 5.此时线程需要访问website域，但是该域正在被main线程初始化，所以要等待main线程执行完成才能打印
                System.out.println(website);
                website = "www.leegang.org";
                System.out.println("退出run方法");
            }
        };
        t.start();
        try {
            // 加入t线程
            // 3.意味着main线程必须等待新线程执行结束后才能向下执行
            t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 1.需要初始化StaticThreadInit类
        // 6.初始化完成后，静态块中的新线程才能执行打印weisite域

        // 7.最终出现死锁
        System.out.println(StaticThreadInit.website);
    }
}
