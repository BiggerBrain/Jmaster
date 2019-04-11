package iterator_pattern.example;

/**
 * Created by dell on 2017/11/13.
 */
public class Test {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(), new CakeHouseMenu());
        waitress.printMenu();
    }
}
