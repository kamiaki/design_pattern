package com.aki.designpattern.结构型.代理模式.动态代理.cglib;

class BookServieDemo{

    public String add(String name) {
        System.out.println("Book Add Method");
        return "添加书籍"+name;
    }
}
