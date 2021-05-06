package com.aki.designpattern.创建型.原型模式;


public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape circle1 = new Circle();
        circle1.setFillColor("red");
        circle1.setFrameColor("green");
        circle1.setInnerText("D啊啊啊啊啊啊啊");
        Obj obj = new Obj();
        obj.setAA("aa");
        obj.setBB("bbbbb不不不");
        circle1.setObj(obj);
        circle1.draw();

        Shape circle2 = circle1.clone();
        circle2.draw();
    }
}
