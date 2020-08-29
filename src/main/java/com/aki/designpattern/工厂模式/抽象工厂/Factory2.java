package com.aki.designpattern.工厂模式.抽象工厂;

public class Factory2 implements AbstractFactory {
    @Override
    public AAAA createProductA() {
        return new aaaa2();
    }

    @Override
    public ProductBI createProductB() {
        return new ProductB2();
    }
}
