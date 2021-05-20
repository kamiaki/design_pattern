package com.aki.designpattern.行为型.命令模式.command;

import com.aki.designpattern.行为型.命令模式.action.Font;

public class NormalFontCommand implements Command {
    private Font font;

    public NormalFontCommand(Font font) {
        this.font = font;
    }

    @Override
    public void execute() {
        font.setFontSize("Normal");
    }
}
