/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package structural.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lishixiong
 * @version 1.0: FlyweightFactory.java, v 0.1 2019年05月06日 18:33 lishixiong Exp $
 */
public class FlyweightFactory {
    private Map<Character, Flyweight> files = new HashMap<>();

    public Flyweight factory(Character state) {
        //先从缓存中查找对象
        Flyweight fly = files.get(state);
        if (fly == null) {
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }
}