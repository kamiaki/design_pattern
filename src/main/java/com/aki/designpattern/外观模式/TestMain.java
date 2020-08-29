package com.aki.designpattern.外观模式;

public class TestMain {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
