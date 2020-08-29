package com.aki.designpattern.外观模式;

// 外观类
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
        this.four = new SubSystemFour();
    }

    public void methodA(){
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        two.methodTwo();
        three.methodThree();
    }
}
