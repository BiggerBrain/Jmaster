/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package bannotation;

import java.lang.reflect.Method;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version $Id: UserCaseTest.java, v 0.1 2019年09月08日 10:08 PM lishixiong Exp $
 */
@Log4j2
public class UserCaseTest {
    public static void main(String[] args) {
        trackUseCases(PasswordUtils.class);
    }

    /**
     *
     * @param clazz
     */
    public static void trackUseCases(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            log.info(method.getAnnotation(User.class));
            User user = method.getAnnotation(User.class);
            if (user != null) {
                log.info("user注解:" + user.id() + " " + user.description());
            }
        }
    }
}