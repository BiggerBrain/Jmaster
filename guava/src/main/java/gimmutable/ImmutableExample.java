/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package gimmutable;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * @author lishixiong
 * @version $Id: ImmutableExample.java, v 0.1 2019年10月13日 5:55 PM lishixiong Exp $
 */
public class ImmutableExample {

    /**
     * 不可变列表
     */
    public static void immutableList() {
        ImmutableList<String> immutableList = ImmutableList.of("1", "2", "3", "4");
        immutableList.add("1"); //不可添加,抛出异常
    }

    public static void list() {
        List<String> list = Lists.newArrayList("1", "2", "3", "4");
        for (String str : list) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        list();
    }

}