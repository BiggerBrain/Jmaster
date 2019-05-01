package behavioral.patterns.status.rebuilding;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        log.info("please wait,we're already giving you gumball");
    }

    @Override
    public void ejectQuarter() {
        log.info("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        log.info("Turning twice doesn't get you another gumball! == sold");

    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            log.info("Oops, out of gumballs! == sold");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
