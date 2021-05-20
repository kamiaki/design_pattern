package com.aki.designpattern.结构型.代理模式.动态代理.cglib;

public class TestMain {
    public static void main(String[] args) {
        BookServieDemo bookServieDemo = new BookServieDemo();
        BookDemoProxy bookDemoProxy = new BookDemoProxy(bookServieDemo);
        bookServieDemo = (BookServieDemo) bookDemoProxy.getProxy();
        bookServieDemo.add("111");
    }
}
