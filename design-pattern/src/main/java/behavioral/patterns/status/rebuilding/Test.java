package behavioral.patterns.status.rebuilding;


import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(11);
        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        log.info(gumballMachine);
    }
}
