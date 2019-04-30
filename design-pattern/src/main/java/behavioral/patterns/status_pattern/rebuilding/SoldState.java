package behavioral.patterns.status_pattern.rebuilding;

/**
 * Created by dell on 2017/11/14.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait,we're already giving you gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball! == sold");

    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs! == sold");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
