package com.aki.designpattern.结构型.组合模式;

public class Biological3 extends LessonModal {

    public Biological3() {
        this.name = "Biological3";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
