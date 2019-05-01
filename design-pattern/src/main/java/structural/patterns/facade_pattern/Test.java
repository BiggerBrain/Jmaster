package structural.patterns.facade_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer(new CPU(), new Memory(), new Disk());
        computer.startup();
        computer.shutdown();
    }
}
