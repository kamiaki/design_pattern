package com.aki.designpattern.结构型.外观模式;

public class TestMain {
    public static void main(String[] args) {
        Facade facade = new Facade(new SubSystemOne());
        facade.methodA();
        facade.methodB();
    }
}
