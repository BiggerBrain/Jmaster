package structural.patterns.decorate;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class Test {
    public static void main(String[] args) {
        Beverage beverage2 = new Espresso();
        beverage2 = new Moca(beverage2);
        beverage2 = new Moca(beverage2);
        Beverage moca = new Moca(beverage2);
        log.info(moca.getDescription());
        log.info("$" + moca.cost());
    }
}
