package com.aki.designpattern.创建型.工厂模式.抽象工厂;


public class TestMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = new Factory1();
        AbstractFactory abstractFactory2 = new Factory2();

        AAAA productA = abstractFactory1.createProductA();
        productA.productName();
        ProductBI productB = abstractFactory1.createProductB();
        productB.productName();
        AAAA productA1 = abstractFactory2.createProductA();
        productA1.productName();
        ProductBI productB1 = abstractFactory2.createProductB();
        productB1.productName();

    }
}
