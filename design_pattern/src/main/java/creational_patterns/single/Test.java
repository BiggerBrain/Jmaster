package creational_patterns.single;

import creational_patterns.single.double_synchronized_singleton.SynchronizedSingleton;
import creational_patterns.single.full_singleton.FullSingleton;
import creational_patterns.single.hunger_singleton.HungerSingleton;
import creational_patterns.single.inner_class_singleton.InnerSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dell on 2017/11/10.
 */
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

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        // 开始用线程池模拟单例模式是否产生真正的单例，比较hashcode值就ok

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        InnerSingleton innerSingleton = InnerSingleton.getInstance();
                        //  innerSingleton.say();
                        System.out.println(innerSingleton.hashCode());
                        // System.out.println("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        System.out.println("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        FullSingleton fullSingleton = FullSingleton.getInstance();
                        // fullSingleton.say();
                        System.out.println(fullSingleton.hashCode());
                        // System.out.println("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        System.out.println("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
                        // hungerSingleton.say();
                        System.out.println(hungerSingleton.hashCode());
                        // System.out.println("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        System.out.println("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
                        //synchronizedSingleton.say();
                        System.out.println(synchronizedSingleton.hashCode());
                        // System.out.println("Accessing: " + NO);
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
