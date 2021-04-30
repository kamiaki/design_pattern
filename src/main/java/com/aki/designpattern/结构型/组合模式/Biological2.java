package com.aki.designpattern.结构型.组合模式;

public class Biological2 extends LessonModal {

    public Biological2() {
        this.name = "Biological2";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
