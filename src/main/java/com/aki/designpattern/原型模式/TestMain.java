package com.aki.designpattern.原型模式;


public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape circle1 = new Circle();
        circle1.setFillColor("red");
        circle1.setFrameColor("green");
        circle1.setInnerText("Design patterns");
        circle1.draw();

        Shape circle2 = circle1.clone();
        circle2.draw();
    }
}
