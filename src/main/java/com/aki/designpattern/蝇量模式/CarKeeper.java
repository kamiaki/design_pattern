package com.aki.designpattern.蝇量模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CarKeeper {
    private Map<String, Car> carKeeper = new ConcurrentHashMap<>();

    public Car getCar(String brand) {
        Car car = carKeeper.get(brand);
        if (car == null) {
            car = new Car(brand);
            carKeeper.put(brand, car);
            System.out.println("新建了" + brand + "car对象!");
        }
        return car;
    }
}
