package creational_patterns.simple.factory;

import lombok.extern.log4j.Log4j2;

/**
 * 邮箱发送
 */
@Log4j2
public class MailProduct implements Product {

    @Override
    public void use() {
      log.info ("邮件产品");
    }
}
