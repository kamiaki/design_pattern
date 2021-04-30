package com.aki.designpattern.结构型.组合模式;

public class Biological extends LessonModal {

    public Biological() {
        this.name = "Biological";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
