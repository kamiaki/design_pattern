package com.aki.designpattern.工厂模式.抽象工厂;

import com.aki.designpattern.工厂模式.简单工厂.ProductI;

public class ProductB1 implements ProductBI {
    @Override
    public void productName() {
        System.out.println("product B1");
    }
}
