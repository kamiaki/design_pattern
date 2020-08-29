package com.aki.designpattern.工厂模式.工厂方法;


public class FactoryA implements FactoryI {
    @Override
    public ProductI create() {
        return new ProductA();
    }
}
