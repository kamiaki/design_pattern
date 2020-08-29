package com.aki.designpattern.访问者模式.element;

import com.aki.designpattern.访问者模式.elementVisitor.ElementVisitor;

//具体元素-整车
public class Car implements Element {

    public void accept(final ElementVisitor visitor) {
        visitor.visit(this);
    }

}
