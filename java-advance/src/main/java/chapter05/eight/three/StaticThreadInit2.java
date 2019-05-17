package chapter05.eight.three;

public class StaticThreadInit2 {
    // 定义一个静态field，设置其初始值为www.crazyit.org
    static String website = "www.crazyit.org";

    static {
        // 创建匿名内部类来启动新线程
        Thread t = new Thread() {
            // 启动新线程将website属性设置为www.leegang.org
            public void run() {
                System.out.println("进入run方法");
                System.out.println(website);
                website = "www.leegang.org";
                System.out.println("退出run方法");
            }
        };
        // 并不会立即进入运行状态，它将知识保持在就绪状态
        t.start();
        try {
            // 加入t线程
//            t.join();
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(StaticThreadInit2.website);
    }
}
