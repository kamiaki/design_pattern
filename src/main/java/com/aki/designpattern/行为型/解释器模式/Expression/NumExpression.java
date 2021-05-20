package com.aki.designpattern.行为型.解释器模式.Expression;

//数字解释器
public class NumExpression implements Expression{
    private int num;
    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
