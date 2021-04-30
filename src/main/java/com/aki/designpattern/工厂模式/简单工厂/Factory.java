package com.aki.designpattern.工厂模式.简单工厂;

// 简单工厂模式
public class Factory {
    public static ProductI create(String productName) {
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
