package com.aki.designpattern.行为型.责任链模式;


public class TestMain {
    public static void main(String[] args) {
        Hubei hubei = new Hubei();
        Guangdong guangdong = new Guangdong();
        beijing beijing = new beijing();
        guangdong.setAction(hubei);
        beijing.setAction(guangdong);
        beijing.todo("广东");
        beijing.todo("北京");
        beijing.todo("外星");
    }
}
