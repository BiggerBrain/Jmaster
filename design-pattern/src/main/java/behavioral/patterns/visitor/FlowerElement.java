package behavioral.patterns.visitor;

/**
 * @author lishixiong
 */
public interface FlowerElement {
    public void accept(Visitor visitor);
}
