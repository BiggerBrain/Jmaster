package interperter_pattern.calculator;

/**
 * Created by dell on 2017/11/14.
 */
public abstract class OperatorExpression extends ArithmeticExpression {
    protected ArithmeticExpression mArithmeticExpression1, mArithmeticExpression2;

    public OperatorExpression(ArithmeticExpression _arithmeticExpression1,
                              ArithmeticExpression _arithmeticExpression2) {
        mArithmeticExpression1 = _arithmeticExpression1;
        mArithmeticExpression2 = _arithmeticExpression2;
    }
}
