package com.aki.designpattern.创建型.工厂模式.简单工厂;


public class TestMain {
    public static void main(String[] args) {
        ProductI productA = Factory.create("A");
        productA.productName();
        //
        ProductI productB = Factory.create("B");
        productB.productName();
    }
}
