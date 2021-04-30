package com.aki.designpattern.创建型.原型模式;


public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape circle1 = new Circle();
        circle1.setFillColor("red");
        circle1.setFrameColor("green");
        circle1.setInnerText("Design patterns");
        circle1.draw();

        Shape circle2 = circle1.clone();
        circle2.draw();
        Shape circle3 = circle1.clone();
        circle3.draw();
        Shape circle4 = circle1.clone();
        circle4.draw();
    }
}
