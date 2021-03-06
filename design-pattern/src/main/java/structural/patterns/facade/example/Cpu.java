package structural.patterns.facade.example;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class Cpu {
    public void startup() {
        log.info("Cpu start!");
    }

    public void shutdown() {
        log.info("Cpu closed!");
    }
}
