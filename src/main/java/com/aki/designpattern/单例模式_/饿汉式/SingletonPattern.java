package com.aki.designpattern.单例模式_.饿汉式;

public class SingletonPattern {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //无参构造私有化，不允许直接new获得实例
    private SingletonPattern() {
    }

    //创建静态啊私有实例
    private static SingletonPattern hungerSingleton = new SingletonPattern();

    //同过公共静态方法获取实例，确保唯一
    public static SingletonPattern getHungerInstance() {
        return hungerSingleton;
    }
}
