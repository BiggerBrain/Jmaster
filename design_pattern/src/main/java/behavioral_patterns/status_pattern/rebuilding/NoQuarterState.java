package behavioral_patterns.status_pattern.rebuilding;

/**
 * Created by dell on 2017/11/14.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there's no quarter == no");
    }

    @Override
    public void dispense() {
        System.out.println("you nedd to pay first == no");
    }
}
