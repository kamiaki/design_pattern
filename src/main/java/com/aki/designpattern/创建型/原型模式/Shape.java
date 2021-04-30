package com.aki.designpattern.创建型.原型模式;

import lombok.Data;

@Data
public abstract class Shape implements Cloneable {
    protected String type;
    protected String fillColor;
    protected String frameColor;
    protected String innerText;

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

    public abstract void draw();
}
