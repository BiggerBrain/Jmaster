package creational.patterns.build;

import lombok.extern.log4j.Log4j2;

/**
 *
 */
@Log4j2
public class SmsBuilder implements IBuilder {
    Product person;

    public SmsBuilder() {
        person = new SmsProduct();
    }

    public void buildBody() {
        person.setBody("建造男人的身体");
        log.info("建造男人的身体");
    }

    public void buildFoot() {
        person.setFoot("建造男人的脚");
        log.info("建造男人的脚");
    }

    public void buildHead() {
        person.setHead("建造男人的头");
        log.info("建造男人的头");
    }

    public Product buildPerson() {
        log.info("建造成功一个男人");
        return person;
    }
}
