package com.aki.designpattern.单例模式_.饿汉式;

public class TestMain {
    public static void main(String[] args) {
        SingletonPattern hungerInstance = SingletonPattern.getHungerInstance();
        hungerInstance.setContent("dsadsadsa");
        String content = SingletonPattern.getHungerInstance().getContent();
        System.out.println(content);
    }
}
