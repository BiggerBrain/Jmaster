/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package abs;

/**
 * @author lishixiong
 * @version 1.0: Animal.java, v 0.1 2019年05月16日 13:58 lishixiong Exp $
 */
public  abstract class Animal {
    private String id;
    protected   String name;
    protected String type;
    public String des;
    String extra;

    public String getName() {
        System.out.println("Animal的getName方法");
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}