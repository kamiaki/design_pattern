package com.aki.designpattern.工厂模式.工厂方法;



public class FactoryC implements FactoryI {
    @Override
    public ProductI create() {
        return new ProductC();
    }
}
