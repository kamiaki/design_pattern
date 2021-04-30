package com.aki.designpattern.行为型.责任链模式;

 public abstract class AbstractAction implements Action{

    public Action action;
    @Override
    public void todo(String type) {

        System.out.println("我是总部,你们处理不了就给我处理!!" + "处理" +type);
    }

    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }
}
