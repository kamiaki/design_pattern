package com.aki.designpattern.创建型.单例模式.饿汉式;

public class TestMain {
    public static void main(String[] args) {
        SingletonPattern hungerInstance = SingletonPattern.getHungerInstance();
        hungerInstance.setContent("dsadsadsa");
        String content = SingletonPattern.getHungerInstance().getContent();
        System.out.println(content);
    }
}
