package com.aki.designpattern.行为型.解释器模式.Expression;

import com.aki.designpattern.行为型.解释器模式.Context;

//终结符表达式角色
public class Constant extends Expression
{
    private int i ;
    public Constant(int i)
    {
       this.i = i;
    }

    public int interpret(Context con)
    {
       return i ;
    }
}
