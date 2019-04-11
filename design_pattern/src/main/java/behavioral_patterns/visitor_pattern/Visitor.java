package behavioral_patterns.visitor_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public interface Visitor {
    public void visit(GladiolusConcreteElement gladiolus);

    public void visit(ChrysanthemumConreteElement chrysanthemum);
}
