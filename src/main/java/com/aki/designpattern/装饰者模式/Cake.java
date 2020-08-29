package com.aki.designpattern.装饰者模式;

public class Cake extends Sweet {
    @Override
    public String getDescription() {
        return "一个蛋糕";
    }

    @Override
    public double cost() {
        return 66;
    }
}
