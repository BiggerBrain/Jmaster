/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package retry;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Predicate;

/**
 * @author lishixiong
 * @version $Id: Retry.java, v 0.1 2019年10月12日 10:55 AM lishixiong Exp $
 */
public class Retry {

    public void uploadOdps(final Map<String, Object> map) {
        // RetryerBuilder 构建重试实例 retryer,可以设置重试源且可以支持多个重试源，可以配置重试次数或重试超时时间，以及可以配置等待时间间隔
        //设置异常重试源
        Retryer<Boolean> retryer = RetryerBuilder.<Boolean> newBuilder().retryIfException().
        //设置自定义段元重试源，
            retryIfResult(new Predicate<Boolean>() {
                @Override
                public boolean apply(Boolean state) {//特别注意：这个apply返回true说明需要重试，与操作逻辑的语义要区分
                    return true;
                }
                //设置重试5次，同样可以设置重试超时时间
            }).withStopStrategy(StopStrategies.stopAfterAttempt(5))
            .withWaitStrategy(WaitStrategies.fixedWait(100L, TimeUnit.MILLISECONDS)).build();//设置每次重试间隔

        try {
            //重试入口采用call方法，用的是java.util.concurrent.Callable<V>的call方法,所以执行是线程安全的
            boolean result = retryer.call(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    try {
                        //特别注意：返回false说明无需重试，返回true说明需要继续重试
                        uploadOdps(map);
                        return false;
                    } catch (Exception e) {
                        throw new Exception(e);
                    }
                }
            });

        } catch (ExecutionException e) {
        } catch (RetryException ex) {
        }
    }

}