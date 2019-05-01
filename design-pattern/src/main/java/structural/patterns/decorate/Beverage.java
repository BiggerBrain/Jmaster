package structural.patterns.decorate;

/**
 * @author lishixiong on 2017/11/10.
 */
public abstract class Beverage {
    String description = "unkown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
