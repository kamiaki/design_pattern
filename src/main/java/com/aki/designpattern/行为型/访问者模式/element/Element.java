package com.aki.designpattern.行为型.访问者模式.element;

import com.aki.designpattern.行为型.访问者模式.elementVisitor.Visitor;

/**
 * 访问者模式，被访问对象实现的超类，用于注入访问者
 */
public abstract class Element {
    abstract public void Accept(Visitor visitor);
}
