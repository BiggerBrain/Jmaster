package behavioral.patterns.visitor;

/**
 * @author lishixiong
 */
public interface Visitor {
    public void visit(GladiolusConcreteElement gladiolus);

    public void visit(ChrysanthemumConreteElement chrysanthemum);
}
