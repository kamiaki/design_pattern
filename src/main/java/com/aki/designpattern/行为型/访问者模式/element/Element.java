package com.aki.designpattern.行为型.访问者模式.element;

import com.aki.designpattern.行为型.访问者模式.elementVisitor.ElementVisitor;

//抽象元素
public interface Element {

    void accept(ElementVisitor visitor);
}

