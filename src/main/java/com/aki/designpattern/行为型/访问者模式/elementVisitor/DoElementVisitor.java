package com.aki.designpattern.行为型.访问者模式.elementVisitor;

import com.aki.designpattern.行为型.访问者模式.element.Body;
import com.aki.designpattern.行为型.访问者模式.element.Car;
import com.aki.designpattern.行为型.访问者模式.element.Engine;
import com.aki.designpattern.行为型.访问者模式.element.Wheel;
import lombok.extern.slf4j.Slf4j;

//具体的一个访问者，纯打印
@Slf4j
public class DoElementVisitor implements ElementVisitor {

    @Override
    public void visit(Body body) {
        log.info("Moving my body");
    }

    @Override
    public void visit(Engine engine) {
        log.info("Starting my engine");
    }

    @Override
    public void visit(Wheel wheel) {
        log.info("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Car car) {
        log.info("Starting my car");
    }
}
