package com.aki.designpattern.行为型.中介者模式;


public class TestMain {
    public static void main(String[] args) {
        //当租客想要租房，房东想要出租房，那么他们都需要到中介那边注册信息
        Mediator mediator = new Mediator();
        Landlord landlord = new Landlord(mediator);
        Tenant tenant = new Tenant(mediator);
        mediator.setLandlord(landlord);
        mediator.setTenant(tenant);
        //租客和房东之间相互通信，先要通过中介
        landlord.send("我是房东");
        tenant.send("我是租客");
    }
}
