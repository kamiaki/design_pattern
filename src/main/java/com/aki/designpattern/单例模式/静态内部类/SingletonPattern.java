package com.aki.designpattern.单例模式.静态内部类;

public class SingletonPattern {
    private String content;

    private SingletonPattern(){

    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static SingletonPattern InnerSingletonInstance() {
        return staticSingleInstance.staticSingleton;
    }

    private static class staticSingleInstance {
        private static SingletonPattern staticSingleton = new SingletonPattern();
    }
}
