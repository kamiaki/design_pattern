package com.aki.designpattern.行为型.访问者模式;

import com.aki.designpattern.行为型.访问者模式.element.Body;
import com.aki.designpattern.行为型.访问者模式.element.Car;
import com.aki.designpattern.行为型.访问者模式.element.Engine;
import com.aki.designpattern.行为型.访问者模式.element.Wheel;
import com.aki.designpattern.行为型.访问者模式.elementVisitor.DoElementVisitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMain {
    public static void main(String[] args) {
        ElementStructure structure = new ElementStructure();
        structure.addElement(new Wheel("front left"));
        structure.addElement(new Wheel("front right"));
        structure.addElement(new Wheel("back left"));
        structure.addElement(new Wheel("back right"));
        structure.addElement(new Body());
        structure.addElement(new Engine());
        structure.addElement(new Car());

        structure.getList().forEach(e -> {
            if (e instanceof Body) {
                log.info("Moving my body");
            } else if (e instanceof Engine) {
                log.info("Starting my engine");
            } else if (e instanceof Car) {
                log.info("Starting my car");
            } else if (e instanceof Wheel) {
                log.info("Kicking my " + ((Wheel) e).getName() + " wheel");
            }
        });

        structure.accept(new DoElementVisitor());
    }
}
