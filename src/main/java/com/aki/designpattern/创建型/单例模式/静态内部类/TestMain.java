package com.aki.designpattern.创建型.单例模式.静态内部类;


public class TestMain {
    public static void main(String[] args) {
        SingletonPattern hungerInstance = SingletonPattern.InnerSingletonInstance();
        hungerInstance.setContent("操操操");
        String content = SingletonPattern.InnerSingletonInstance().getContent();
        System.out.println(content);
    }
}
