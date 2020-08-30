package com.aki.designpattern.中介者模式;

public class Landlord extends AbstractColleague {

    public Landlord(AbstractMediator mediator) {
        super(mediator);
    }

    //向中介者发送消息
    public void send(String message) {
        super.mediator.operate(this, message);
    }

    //从中介者接收到的消息
    public void receive(String message) {
        System.out.println("房东收到消息：" + message);
    }
}
