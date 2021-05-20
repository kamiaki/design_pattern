package com.aki.designpattern.行为型.命令模式.command;

import com.aki.designpattern.行为型.命令模式.action.Background;

public class DefaultBackground implements Command {

    private Background background;

    public DefaultBackground(Background background) {
        this.background = background;
    }

    @Override
    public void execute() {
        background.setBgColor("Default color");
    }
}
