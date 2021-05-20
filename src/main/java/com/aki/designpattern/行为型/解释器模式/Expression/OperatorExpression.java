package com.aki.designpattern.行为型.解释器模式.Expression;

//操作符解释器抽象类
public abstract class OperatorExpression implements Expression{
    protected Expression exp1,exp2;

    public OperatorExpression(Expression exp1,Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

}
