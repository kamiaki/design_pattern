package com.aki.designpattern.行为型.状态模式;

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
