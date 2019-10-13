/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lishixiong.model;

/**
 * @author lishixiong
 * @version $Id: Person.java, v 0.1 2019年09月15日 4:09 PM lishixiong Exp $
 */
public class Person {

    private String name;
    private String sex;

    /**
     * To string string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", sex='" + sex + '\'' + '}';
    }
}