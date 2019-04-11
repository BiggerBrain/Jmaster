package behavioral_patterns.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/11/14.
 */
public class ObjectStructure {
    private final List<FlowerElement> elements = new ArrayList<FlowerElement>();

    public void addElement(final FlowerElement e) {
        elements.add(e);
    }

    public void removeElement(final FlowerElement e) {
        elements.remove(e);
    }

    public void accept(final Visitor visitor) {
        for (final FlowerElement e : elements) {
            e.accept(visitor);
        }
    }
}
