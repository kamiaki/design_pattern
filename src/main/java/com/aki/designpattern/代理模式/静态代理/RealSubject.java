package com.aki.designpattern.代理模式.静态代理;

class RealSubject implements Subject {
    public void request(){
        System.out.println("RealSubject");
    }
}
