package behavioral.patterns.status.rebuilding;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        log.info("you inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        log.info("you haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        log.info("you turned, but there's no quarter == no");
    }

    @Override
    public void dispense() {
        log.info("you nedd to pay first == no");
    }
}
