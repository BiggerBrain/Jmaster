package interperter_pattern.easy_model;

/**
 * Created by dell on 2017/11/14.
 */
public class PlusExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        String in = context.getIn();
        int v = Integer.parseInt(in);
        context.setOut(++v);
    }

}

