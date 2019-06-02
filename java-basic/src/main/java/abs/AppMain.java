package abs; /**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lishixiong
 * @version 1.0: abs.AppMain.java, v 0.1 2019年05月17日 09:41 lishixiong Exp $
 */
class MyTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("s");
        return "1";
    }
}
public class AppMain {
    public static void main(String[] args) {
//        Cat cat=new Cat();
//        System.out.println(cat.getName());

        //
        System.out.println(System.currentTimeMillis());
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        try {
            executor.invokeAll(new ArrayList<MyTask>());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String result = null;
        System.out.println(result + ":" + result);
    }
}