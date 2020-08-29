package com.aki.designpattern.单例模式_.懒汉式;



public class TestMain {
    public static void main(String[] args) {
        SingletonPattern hungerInstance = SingletonPattern.getVolatileInstance();
        hungerInstance.setContent("啊啊啊");
        String content = SingletonPattern.getVolatileInstance().getContent();
        System.out.println(content);
    }
}
