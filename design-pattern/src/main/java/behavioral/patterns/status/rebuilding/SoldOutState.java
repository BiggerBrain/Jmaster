package behavioral.patterns.status.rebuilding;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        log.info("you can't insert a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        log.info("you can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        log.info("you turned, but there are no gumballs == soldout");
    }

    @Override
    public void dispense() {
        log.info("no gumball dispensed == soldout");
    }
}
