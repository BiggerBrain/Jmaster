package structural.patterns.decorate_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class Moca extends CondimentDecorate {
    Beverage beverage;

    public Moca(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",moca";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 1.2;
    }
}
