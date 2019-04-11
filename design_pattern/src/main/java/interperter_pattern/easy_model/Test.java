package interperter_pattern.easy_model;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context("10");

        new MinusExpression().interpret(context);
        new PlusExpression().interpret(context);
        new MinusExpression().interpret(context);
        new PlusExpression().interpret(context);
        System.out.println(context.getOut());
    }
}
