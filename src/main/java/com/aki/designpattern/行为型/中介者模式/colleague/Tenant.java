package com.aki.designpattern.行为型.中介者模式.colleague;

import com.aki.designpattern.行为型.中介者模式.Mediator.AbstractMediator;

public class Tenant extends AbstractColleague {

    public Tenant(AbstractMediator mediator) {
        super(mediator);
    }

    //向中介者发送消息
    public void send(String message) {
        super.mediator.operate(this, message);
    }

    //从中介者接收到的消息
    public void receive(String message) {
        System.out.println("租客收到消息：" + message);
    }
}
