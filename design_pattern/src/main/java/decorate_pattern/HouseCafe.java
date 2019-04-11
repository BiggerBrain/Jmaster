package decorate_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class HouseCafe extends Beverage {
    public HouseCafe() {
        super.description = "这是house咖啡";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
