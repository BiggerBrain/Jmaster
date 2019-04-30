package creational_patterns.simple.factory;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1: ProductEnum.java, v 0.1 2019年04月30日 15:13 lishixiong Exp $
 */
@Log4j2
public class Fatory {
    public static Product createProduct(ProductEnum type) {
        switch (type){
            case SMS: return new SmsProduct();
            case MAIL:return new MailProduct();
            default:return null;
        }
    }

}
