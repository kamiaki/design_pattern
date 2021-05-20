package com.aki.designpattern.行为型.解释器模式;

public class TestMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("1 + 2 + 3 - 4");
        System.out.println(calculator.calculate());
    }
}
