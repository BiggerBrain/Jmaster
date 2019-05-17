package chapter07.eight;

public class SleepTest {
    /**
     * 如果在XP系统运行，发现大部分时候都输出0，而不是2，还有极少数机会输出16（也不是2）
     * <p>
     * 因为sleep底层为native方法，具体运行结果根据平台不同效果也可能不同
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        // 让当前程序暂停2ms
        Thread.sleep(2);
        System.out.println(System.currentTimeMillis() - start);
    }
}
