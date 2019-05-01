package creational.patterns.single;

import creational.patterns.single.double_synchronized_singleton.SynchronizedSingleton;
import creational.patterns.single.full_singleton.FullSingleton;
import creational.patterns.single.hunger_singleton.HungerSingleton;
import creational.patterns.single.inner_class_singleton.InnerSingleton;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class Test {
    public static void main(String[] args) {
        FullSingleton fullSingleton = FullSingleton.getInstance();
        fullSingleton.say();
        InnerSingleton innerSingleton = InnerSingleton.getInstance();
        innerSingleton.say();
        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
        hungerSingleton.say();
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        synchronizedSingleton.say();

        log.info("------------------------------");
        log.info("------------------------------");
        log.info("------------------------------");

        // 开始用线程池模拟单例模式是否产生真正的单例，比较hashcode值就ok

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        InnerSingleton innerSingleton = InnerSingleton.getInstance();
                        //  innerSingleton.say();
                        log.info(innerSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        log.info("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        FullSingleton fullSingleton = FullSingleton.getInstance();
                        // fullSingleton.say();
                        log.info(fullSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        log.info("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
                        // hungerSingleton.say();
                        log.info(hungerSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        log.info("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
                        //synchronizedSingleton.say();
                        log.info(synchronizedSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }

    }
}
