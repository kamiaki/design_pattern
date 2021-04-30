package com.aki.designpattern.结构型.蝇量模式;

public class TestMain {
    public static void main(String[] args) {
        CarKeeper carKeeper = new CarKeeper();
        Car car1 = carKeeper.getCar("宝马");
        car1.drive();
        Car car2 = carKeeper.getCar("奔驰");
        car2.drive();
        Car car3 = carKeeper.getCar("奥迪");
        car3.drive();
        Car car4 = carKeeper.getCar("宝马");
        car4.drive();
        Car car5 = carKeeper.getCar("奔驰");
        car5.drive();
        Car car6 = carKeeper.getCar("奥迪");
        car6.drive();
    }
}
