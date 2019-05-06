/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.commend;

/**
 * @author lishixiong
 * @version 1.0: Invoker.java, v 0.1 2019年05月06日 22:13 lishixiong Exp $
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){

        command.execute();
    }
}