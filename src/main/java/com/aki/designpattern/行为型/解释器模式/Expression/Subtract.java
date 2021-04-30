package com.aki.designpattern.行为型.解释器模式.Expression;

import com.aki.designpattern.行为型.解释器模式.Context;

public class Subtract extends Expression {
    private Expression left, right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context con) {
        return left.interpret(con) - right.interpret(con);
    }
}
