package structural.patterns.decorate_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public abstract class Beverage {
    String description = "unkown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
