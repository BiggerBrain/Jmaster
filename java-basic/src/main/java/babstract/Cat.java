/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package babstract;

/**
 * @author lishixiong
 * @version 1.0: Cat.java, v 0.1 2019年05月16日 14:00 lishixiong Exp $
 */
public class Cat extends Animal {
    //public String name="1";
    public Cat() {
        name = "lsx";
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
    }
}