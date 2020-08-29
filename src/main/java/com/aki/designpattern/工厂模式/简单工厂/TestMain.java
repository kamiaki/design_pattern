package com.aki.designpattern.工厂模式.简单工厂;


public class TestMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ProductI productA = factory.create("A");
        productA.productName();
        //
        ProductI productB = factory.create("B");
        productB.productName();
    }
}
