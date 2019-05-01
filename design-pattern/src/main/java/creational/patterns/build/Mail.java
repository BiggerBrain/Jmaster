package creational.patterns.build;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Mail extends Product {
    public Mail() {
        log.info("开始建造女人");
    }
}
