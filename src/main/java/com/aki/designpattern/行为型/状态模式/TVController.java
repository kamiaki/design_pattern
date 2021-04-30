package com.aki.designpattern.行为型.状态模式;

public class TVController implements  Power,State{
    private State state;
    @Override
    public void PowerOn() {
        state=new statePowerOn();
    }
    @Override
    public void PowerOff() {
        state=new statePowerOff();
    }
    @Override
    public void changeChannel() {
        state.changeChannel();
    }
    @Override
    public void changeSound() {
        state.changeSound();
    }
}
