package visitor_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class ChrysanthemumConreteElement implements FlowerElement {
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}