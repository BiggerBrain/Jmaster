package behavioral.patterns.strategy;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        log.info("i'm a redHeadDuck");
    }
}
