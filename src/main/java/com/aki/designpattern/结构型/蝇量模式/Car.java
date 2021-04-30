package com.aki.designpattern.结构型.蝇量模式;

// 汽车类
public class Car implements CarI {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void drive() {
        System.out.println("开" + brand + "car");
    }
}
