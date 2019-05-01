package behavioral.patterns.status;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);


    }
}
