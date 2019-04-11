package behavioral_patterns.templet_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class Tea extends CafeTeeBeverage {
    @Override
    void brew() {
        System.out.println("drop tea");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
}
