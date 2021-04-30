package com.aki.designpattern.行为型.解释器模式.Expression;

import com.aki.designpattern.行为型.解释器模式.Context;

public class Variable extends Expression
{
    public int interpret(Context con)
    {
       //this为调用interpret方法的Variable对象
       return con.LookupValue(this);
    }
}
