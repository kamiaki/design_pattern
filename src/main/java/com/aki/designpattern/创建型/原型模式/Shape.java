package com.aki.designpattern.创建型.原型模式;

import lombok.Data;

@Data
public abstract class Shape implements Cloneable {
    protected String type;
    protected String fillColor;
    protected String frameColor;
    protected String innerText;
    protected Obj obj;

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape shape = (Shape) super.clone();
        // 不加这一句的话就是浅拷贝，只是拷贝了obj这个指针
        shape.setObj(this.obj.clone());
        return shape;
    }

    public abstract void draw();
}
