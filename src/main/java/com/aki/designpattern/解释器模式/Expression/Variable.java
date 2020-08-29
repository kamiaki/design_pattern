package com.aki.designpattern.解释器模式.Expression;

import com.aki.designpattern.解释器模式.Context;
import com.aki.designpattern.解释器模式.Expression.Expression;

public class Variable extends Expression
{
    public int interpret(Context con)
    {
       //this为调用interpret方法的Variable对象
       return con.LookupValue(this);
    }
}
