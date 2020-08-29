package com.aki.designpattern.解释器模式.Expression;

import com.aki.designpattern.解释器模式.Context;

//抽象表达式角色，也可以用接口来实现
public abstract class Expression
{
    public abstract int interpret(Context con);
}
