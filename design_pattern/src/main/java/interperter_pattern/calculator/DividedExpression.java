package interperter_pattern.calculator;

/**
 * Created by dell on 2017/11/14.
 */
public class DividedExpression extends OperatorExpression {
    //两数值相减
    public DividedExpression(ArithmeticExpression _arithmeticExpression1,
                             ArithmeticExpression _arithmeticExpression2) {
        super(_arithmeticExpression1, _arithmeticExpression2);
    }

    @Override
    public int interptet() {
        return mArithmeticExpression1.interptet() / mArithmeticExpression2.interptet();
    }
}

