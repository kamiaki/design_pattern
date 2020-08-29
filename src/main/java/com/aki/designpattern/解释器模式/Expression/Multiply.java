package com.aki.designpattern.解释器模式.Expression;

import com.aki.designpattern.解释器模式.Context;

public class Multiply extends Expression
{
    private Expression left , right ;
    public Multiply(Expression left , Expression right)
    {
       this.left = left ;
       this.right= right ;
    }

    public int interpret(Context con)
    {
       return left.interpret(con) * right.interpret(con);
    }
}
