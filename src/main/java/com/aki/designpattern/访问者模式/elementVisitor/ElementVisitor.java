package com.aki.designpattern.访问者模式.elementVisitor;

import com.aki.designpattern.访问者模式.element.Body;
import com.aki.designpattern.访问者模式.element.Car;
import com.aki.designpattern.访问者模式.element.Engine;
import com.aki.designpattern.访问者模式.element.Wheel;

//抽象访问者
public interface ElementVisitor {

    void visit(Body body);

    void visit(Engine engine);

    void visit(Wheel wheel);

    void visit(Car car);
}
