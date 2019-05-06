/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.interpreter;

/**
 * @author lishixiong
 * @version 1.0: NonterminalExpression.java, v 0.1 2019年05月06日 22:22 lishixiong Exp $
 */
public class NonterminalExpression implements IExpression {
    private TerminalExpression terminalExpressionA, terminalExpressionB;
    public NonterminalExpression(TerminalExpression terminalExpressionA, TerminalExpression terminalExpressionB){
        this.terminalExpressionA = terminalExpressionA;
        this.terminalExpressionB = terminalExpressionB;
    }

    public void interpret() {
        Context context=null;
        terminalExpressionA.interpret(context);
        terminalExpressionB.interpret(context);
        System.out.println("interpreter terminalExpressionA AND  terminalExpressionB ...");
    }

    @Override
    public void interpret(Context context) {

    }
}