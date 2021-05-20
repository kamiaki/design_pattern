package com.aki.designpattern.行为型.责任链模式;

import lombok.Data;

@Data
public abstract class AbstractAction implements Action {
    private Action action;

    @Override
    public void todo(String type) {
        System.out.println("我是总部,你们处理不了就给我处理!!" + "处理" + type);
    }
}
