package com.aki.designpattern.行为型.解释器模式.Expression;

import com.aki.designpattern.行为型.解释器模式.Context;

//非终结符表达式角色
public class Add extends Expression {
    private Expression left, right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context con) {
        return left.interpret(con) + right.interpret(con);
    }
}
