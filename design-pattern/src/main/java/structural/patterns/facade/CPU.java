package structural.patterns.facade;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/11.
 */
@Log4j2
public class CPU {
    public void startup() {
        log.info("CPU start!");
    }

    public void shutdown() {
        log.info("CPU closed!");
    }
}
