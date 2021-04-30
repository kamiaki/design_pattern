package com.aki.designpattern.结构型.装饰者模式;

/**
 * 装饰器
 */
public abstract class Decorator extends Sweet {
    //限制必须有这两个方法
    public abstract String getDescription();
    public abstract double cost();
}
