package behavioral.patterns.strategy;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        log.info("gua gua gua");
    }
}
