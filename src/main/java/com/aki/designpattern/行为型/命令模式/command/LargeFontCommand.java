package com.aki.designpattern.行为型.命令模式.command;

import com.aki.designpattern.行为型.命令模式.action.Font;

public class LargeFontCommand implements Command {

    private Font font;

    public LargeFontCommand(Font font) {
        this.font = font;
    }

    @Override
    public void execute() {
        font.setFontSize("Large");
    }
}
