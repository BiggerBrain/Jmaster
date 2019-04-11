package behavioral_patterns.status_pattern.rebuilding;

/**
 * 用糖果售卖机做演示，这是不用状态模式的情况下，代码混乱不堪
 * Created by dell on 2017/11/14.
 */
public class GumballMachine {
    State soldOutState;
    State soldState;
    State noQuarterState;
    State hasQuarterState;
    State winnerState;
    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("a gunball will comes rolling out the slot...");
        if (count != 0)
            count--;
    }

    @Override
    public String toString() {
        return "state : " + state.getClass().getName() + "\tcount : " + count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
