package com.aki.designpattern.访问者模式.element;

import com.aki.designpattern.访问者模式.elementVisitor.ElementVisitor;

//具体元素-车身
public class Body implements Element {

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}
