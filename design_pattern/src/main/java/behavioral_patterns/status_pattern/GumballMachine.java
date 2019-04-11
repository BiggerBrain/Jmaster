package behavioral_patterns.status_pattern;

/**
 * 用糖果售卖机做演示，这是不用状态模式的情况下，代码混乱不堪
 * Created by dell on 2017/11/14.
 */
public class GumballMachine {
    final static int SOLO_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int status = SOLO_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            status = NO_QUARTER;
        }
    }

    // 插入硬币
    public void insertQuarter() {
        if (status == HAS_QUARTER) {
            System.out.println("you can't insert anther quarter");
        } else if (status == NO_QUARTER) {
            status = HAS_QUARTER;
            System.out.println("you insert a quarter");
        } else if (status == SOLO_OUT) {
            System.out.println("you can't insert a quarter, the machine is sold out");
        } else if (status == SOLD) {
            System.out.println("please waiting,you already will get a gumball");
        }
    }

    // 退回硬币
    public void ejectQuarter() {
        if (status == HAS_QUARTER) {
            System.out.println("quarter return");
            status = NO_QUARTER;
        } else if (status == NO_QUARTER) {
            System.out.println("you have insert a quarter");
        } else if (status == SOLO_OUT) {
            System.out.println("sorry,you already turned the crank");
        } else if (status == SOLD) {
            System.out.println("you can't eject,you haven't inserted a quarter yet");
        }
    }

    // 转动曲柄
    public void turnCrank() {
        if (status == SOLD) {
            System.out.println("turing twice doesn't get you another gunball");
        } else if (status == NO_QUARTER) {
            System.out.println("you turned but there's no quarter");
        } else if (status == SOLO_OUT) {
            System.out.println("you turned , but there are no gumballs");
        } else if (status == HAS_QUARTER) {
            System.out.println("you turned...");
            status = SOLD;
            dispense();
        }
    }

    //发放糖果
    public void dispense() {
        if (status == SOLD) {
            System.out.println("agumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("oops, out of gumballs!");
                status = SOLO_OUT;
            } else {
                status = NO_QUARTER;
            }
        } else if (status == NO_QUARTER) {
            System.out.println("you need to pay first");
        } else if (status == SOLO_OUT) {
            System.out.println("no gumball dispensed");
        } else if (status == HAS_QUARTER) {
            System.out.println("no gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "status :" + status + "\t count :" + count;
    }

}
