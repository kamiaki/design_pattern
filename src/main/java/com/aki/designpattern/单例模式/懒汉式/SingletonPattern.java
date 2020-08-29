package com.aki.designpattern.单例模式.懒汉式;

public class SingletonPattern {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //volatile+懒汉式双层检查(DCL,Double Check Lock)
    private static volatile SingletonPattern volatileSingleton;

    public static SingletonPattern getVolatileInstance() {
        if (volatileSingleton == null) {//第一层检查
            //在此处加锁同步比在方法出加锁同步缩小了范围，性能稍高
            synchronized (SingletonPattern.class) {
                if (volatileSingleton == null) {//第二层检查
                    volatileSingleton = new SingletonPattern();
                }
            }
        }
        return volatileSingleton;
    }
}
