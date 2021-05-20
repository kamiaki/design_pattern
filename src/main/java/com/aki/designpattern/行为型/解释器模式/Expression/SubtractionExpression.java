package com.aki.designpattern.行为型.解释器模式.Expression;

//减法解释器
public class SubtractionExpression extends OperatorExpression{
    public SubtractionExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
