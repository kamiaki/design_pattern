package com.aki.designpattern.创建型.单例模式.枚举实现;


public class TestMain {
    public static void main(String[] args) {
        System.out.println(User.getInstance());
        System.out.println(User.getInstance());
        System.out.println(User.getInstance()==User.getInstance());

        User instance = User.getInstance();
        instance.setValue1("dsadsads啊啊啊");
        User instance1 = User.getInstance();
        System.out.println(instance1.getValue1());

    }
}
