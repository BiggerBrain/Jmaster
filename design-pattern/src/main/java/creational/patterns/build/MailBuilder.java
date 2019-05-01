package creational.patterns.build;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class MailBuilder implements IBuilder {
    Product person;

    public MailBuilder() {
        person = new Mail();
    }

    public void buildBody() {
        person.setBody("建造女人的身体");
        log.info("建造女人的身体");
    }

    public void buildFoot() {
        person.setFoot("建造女人的脚");
        log.info("建造女人的脚");
    }

    public void buildHead() {
        person.setHead("建造女人的头");
        log.info("建造女人的头");
    }

    public Product buildPerson() {
        log.info("建造成功一个女人");
        return person;
    }
}  
