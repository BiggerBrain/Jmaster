package structural_patterns.decorate_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage2 = new Espresso();
        beverage2 = new Moca(beverage2);
        beverage2 = new Moca(beverage2);
        Beverage moca = new Moca(beverage2);
        System.out.println(moca.getDescription());
        System.out.println("$" + moca.cost());
    }
}
