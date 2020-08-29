package com.aki.designpattern.状态模式;

public class TestMain {
    public static void main(String[] args) {
        TVController tc=new TVController();
        tc.PowerOn();
        tc.changeChannel();
        tc.changeSound();
        tc.PowerOff();
        tc.changeSound();
    }
}
