package behavioral.patterns.templet;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

/**
 * @author lishixiong on 2017/11/11.
 */
@Log4j2
public class Cafe extends CafeTeeBeverage {
    @Override
    void brew() {
        log.info("drop cafe");
    }

    @Override
    void addCondiments() {
        log.info("add sugar and milk");
    }

    @Override
    public boolean getSureCondiments() {
        if (getUserInput()) {
            return true;
        }
        return false;
    }

    boolean getUserInput() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        log.info("if you want Condiments please enter Y !!!");
        if (str.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }

    private void sss() {
        log.info("------------------------------");
    }
}
