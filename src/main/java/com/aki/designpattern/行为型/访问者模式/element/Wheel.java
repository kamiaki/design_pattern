package com.aki.designpattern.行为型.访问者模式.element;

import com.aki.designpattern.行为型.访问者模式.elementVisitor.ElementVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;

//具体元素-车轮
@Data
@AllArgsConstructor
public class Wheel implements Element {

    private String name;

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}
