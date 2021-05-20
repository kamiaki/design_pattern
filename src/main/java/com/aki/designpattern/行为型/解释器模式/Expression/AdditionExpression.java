package com.aki.designpattern.行为型.解释器模式.Expression;

//加法解释器
public class AdditionExpression extends OperatorExpression{
    public AdditionExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
