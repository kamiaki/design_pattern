package com.aki.designpattern.原型模式;

public class Rectangle extends Shape {
    public Rectangle() {
        this.type = "rectangle";
    }

    public void draw() {
        System.out.println("Draw a " + type + ", fill with " + fillColor + ", frame color is " + frameColor + ", inner text is [" + innerText + "].");
    }
}
