package com.aki.designpattern.状态模式;

public class  statePowerOn implements State{
    @Override
    public void changeChannel() {
        System.out.println("调频道");
    }
    @Override
    public void changeSound() {
        System.out.println("调声音");
    }
}
