/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package bannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

enum Sex {
          MAN, WOMAN
}

/**定义
 * @Target
 * 表示该注解可以用于什么地方，可能的ElementType参数有：
 * CONSTRUCTOR：构造器的声明
 * FIELD：域声明（包括enum实例）
 * LOCAL_VARIABLE：局部变量声明
 * METHOD：方法声明
 * PACKAGE：包声明
 * PARAMETER：参数声明
 * TYPE：类、接口（包括注解类型）或enum声明
 * @Retention
 * 表示需要在什么级别保存该注解信息。可选的RetentionPolicy参数包括：
 * SOURCE：注解将被编译器丢弃
 * CLASS：注解在class文件中可用，但会被VM丢弃
 * RUNTIME：VM将在运行期间保留注解，因此可以通过反射机制读取注解的信息
 * @author lishixiong
 * @version $Id: User.java, v 0.1 2019年09月08日 9:56 PM lishixiong Exp $
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface User {
    String id();

    String description() default "";

    String[] characteristics() default {};

    Sex sex() default Sex.MAN;

}