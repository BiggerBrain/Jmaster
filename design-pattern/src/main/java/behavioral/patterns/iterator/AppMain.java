/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.iterator;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月06日 22:36 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        BookShelf namesRepository = new BookShelf(1);

        for(Iterator iter = namesRepository.iterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}