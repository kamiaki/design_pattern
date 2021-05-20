package com.aki.designpattern.行为型.访问者模式.elementVisitor;

import com.aki.designpattern.行为型.访问者模式.element.Element;

/**
 * 访问者模式，访问者接口对象
 */
public interface Visitor {
    void Visit(Element element);
}
