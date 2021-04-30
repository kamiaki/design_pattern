package com.aki.designpattern.结构型.装饰者模式;

/**
 * 装饰器具体实现
 */
public class FruitDecorator extends Decorator {
    Sweet sweet;

    public FruitDecorator(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String getDescription() {
        return sweet.getDescription() + "，水果";
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }
}
