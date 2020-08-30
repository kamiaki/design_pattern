package com.aki.designpattern.原型模式;

public class Circle extends Shape {
    public Circle() {
        this.type = "circle";
    }

    public void draw() {
        System.out.println("Draw a " + type + ", fill with " + fillColor + ", frame color is " + frameColor + ", inner text is [" + innerText + "].");
    }
}
