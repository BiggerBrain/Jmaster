package interperter_pattern.calculator;

/**
 * Created by dell on 2017/11/14.
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int _num) {
        num = _num;
    }

    @Override
    public int interptet() {
        return num;
    }
}
