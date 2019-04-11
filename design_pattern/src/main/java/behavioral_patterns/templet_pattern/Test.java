package behavioral_patterns.templet_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class Test {
    public static void main(String[] args) {
        CafeTeeBeverage cafeTeeBeverage1 = new Cafe();
        CafeTeeBeverage cafeTeeBeverage2 = new Tea();
        cafeTeeBeverage1.prepareRecipe();
        cafeTeeBeverage2.prepareRecipe();
    }

}
