package behavioral_patterns.visitor_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(final String[] args) {
        final ObjectStructure os = new ObjectStructure();
        os.addElement(new GladiolusConcreteElement());
        os.addElement(new ChrysanthemumConreteElement());

        final GladiolusVisitor gVisitor = new GladiolusVisitor();
        final ChrysanthemumVisitor chVisitor = new ChrysanthemumVisitor();

        os.accept(gVisitor);
        os.accept(chVisitor);

    }

}
