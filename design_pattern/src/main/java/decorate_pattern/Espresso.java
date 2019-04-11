package decorate_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class Espresso extends Beverage {
    public Espresso() {
        super.description = "浓缩咖啡";
    }

    @Override
    public Double cost() {
        return 1.39;
    }
}
