package behavioral_patterns.status_pattern.rebuilding;

/**
 * Created by dell on 2017/11/14.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there are no gumballs == soldout");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed == soldout");
    }
}
