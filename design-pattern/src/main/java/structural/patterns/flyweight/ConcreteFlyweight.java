/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package structural.patterns.flyweight;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteFlyweight.java, v 0.1 2019年05月06日 18:32 lishixiong Exp $
 */
@Log4j2
public class ConcreteFlyweight implements Flyweight {
    private Character intrinsicState = null;

    /**
     * 构造函数，内蕴状态作为参数传入
     *
     * @param state
     */
    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        log.info("Intrinsic State = " + this.intrinsicState);
        log.info("Extrinsic State = " + state);
    }

}