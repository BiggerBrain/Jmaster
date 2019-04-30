package behavioral.patterns.visitor_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public interface FlowerElement {
    public void accept(Visitor visitor);
}
