package com.aki.designpattern.状态模式;

public class statePowerOff implements  State{
    @Override
    public void changeChannel() {
        System.out.println("没开机");
    }
    @Override
    public void changeSound() {
        System.out.println("没开机");
    }
}
