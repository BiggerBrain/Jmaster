/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package bannotation;

import java.lang.reflect.Method;

/**
 * @author lishixiong
 * @version $Id: UserCaseTest.java, v 0.1 2019年09月08日 10:08 PM lishixiong Exp $
 */
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
            System.out.println(method.getAnnotation(User.class));
            User user = method.getAnnotation(User.class);
            if (user != null) {
                System.out.println("user注解:" + user.id() + " " + user.description());
            }
        }
    }
}