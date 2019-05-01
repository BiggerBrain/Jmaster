package behavioral.patterns.status.rebuilding;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        log.info("Turning twice doesn't get you another gumball! == winner");

    }

    @Override
    public void dispense() {
        log.info("you're a winner! you get two gumballs for you quarter == winner");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                log.info("Oops, out of gumballs! == winner");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
