package com.aki.designpattern.创建型.原型模式;

import lombok.Data;

@Data
public class Obj implements Cloneable {
    private String AA;
    private String BB;

    @Override
    public Obj clone() throws CloneNotSupportedException {
        return (Obj)super.clone();
    }
}
