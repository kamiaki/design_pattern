package com.aki.designpattern.工厂模式.工厂方法;


public class TestMain {
    public static void main(String[] args) {
        FactoryI factoryA = new FactoryA();
        ProductI productA = factoryA.create();
        productA.productName();
        //
        FactoryI factoryB = new FactoryB();
        ProductI productB = factoryB.create();
        productB.productName();
        //
        FactoryI factoryC = new FactoryC();
        ProductI productC = factoryC.create();
        productC.productName();
    }
}
