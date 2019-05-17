package chapter05.eight.three;

public class StaticThreadInit3 {
    // 定义一个静态field
    static String website;

    static {
        // 创建匿名内部类来启动新线程
        Thread t = new Thread() {
            // 启动新线程将website属性设置为www.leegang.org
            public void run() {
                website = "www.leegang.org";
            }
        };
        t.start();
    }

    public static void main(String[] args) {
        System.out.println(StaticThreadInit3.website);
    }
}
