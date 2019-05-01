package behavioral.patterns.status.rebuilding;

import lombok.extern.log4j.Log4j2;

import java.util.Random;

/**
 * @author lishixiong
 */
@Log4j2
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        log.info("you can't insert anther quarter");
    }

    @Override
    public void ejectQuarter() {
        log.info("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        log.info("you returned == has");
        int winner = random.nextInt(10);
        log.info("---------------if winner random num == 0 ,you can get two gumball-----------------");
        log.info("---------------" + winner + "-----------------");
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        log.info("no gumball dispense == has");
    }
}
