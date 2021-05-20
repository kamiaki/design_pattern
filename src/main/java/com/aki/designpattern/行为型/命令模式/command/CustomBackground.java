package com.aki.designpattern.行为型.命令模式.command;

import com.aki.designpattern.行为型.命令模式.action.Background;

public class CustomBackground implements Command {
    private Background background;
    private String color = null;

    public CustomBackground(Background background) {
        this.background = background;
    }

    @Override
    public void execute() {
        background.setBgColor("Custom background");
    }
}
