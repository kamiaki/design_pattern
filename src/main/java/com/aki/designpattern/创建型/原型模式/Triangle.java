package com.aki.designpattern.创建型.原型模式;

public class Triangle extends Shape {
    public Triangle() {
        this.type = "triangle";
    }

    public void draw() {
        System.out.println("Draw a " + type + ", fill with " + fillColor + ", frame color is " + frameColor + ", inner text is [" + innerText + "].");
    }
}
