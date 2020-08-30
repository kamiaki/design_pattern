package com.aki.designpattern.代理模式.静态代理;

public class TestMain {
    public static void main(String args[]) {
        RealSubject subject = new RealSubject();
        Proxy p = new Proxy(subject);
        p.request();
    }
}
