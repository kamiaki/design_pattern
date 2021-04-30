package com.aki.designpattern.创建型.单例模式.枚举实现;

public class User {
    private String value1;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    //私有化构造函数
    private User() {
    }

    //定义一个静态枚举类
    enum SingletonEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private User user;

        //私有化枚举的构造函数
        SingletonEnum() {
            user = new User();
        }

        public User getInstnce() {
            return user;
        }
    }

    //对外暴露一个获取User对象的静态方法
    public static User getInstance() {
        return SingletonEnum.INSTANCE.getInstnce();
    }
}
