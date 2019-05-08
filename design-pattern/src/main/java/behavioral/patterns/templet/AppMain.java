package behavioral.patterns.templet;

/**
 * @author lishixiong on 2017/11/11.
 */
public class AppMain {
    public static void main(String[] args) {
        CafeTeeBeverage cafeTeeBeverage1 = new Cafe();
        CafeTeeBeverage cafeTeeBeverage2 = new Tea();
        cafeTeeBeverage1.prepareRecipe();
        cafeTeeBeverage2.prepareRecipe();
    }

}
