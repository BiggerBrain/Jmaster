package behavioral_patterns.status_pattern.rebuilding;

import java.util.Random;

/**
 * Created by dell on 2017/11/14.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert anther quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you returned == has");
        int winner = random.nextInt(10);
        System.out.println("---------------if winner random num == 0 ,you can get two gumball-----------------");
        System.out.println("---------------" + winner + "-----------------");
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispense == has");
    }
}
