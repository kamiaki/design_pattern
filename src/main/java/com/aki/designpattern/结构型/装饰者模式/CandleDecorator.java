package com.aki.designpattern.结构型.装饰者模式;

/**
 * 装饰器具体实现
 */
public class CandleDecorator extends Decorator {
    Sweet sweet;

    public CandleDecorator(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String getDescription() {
        return sweet.getDescription() + "，蜡烛";
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }
}
