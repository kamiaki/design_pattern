package com.aki.designpattern.行为型.命令模式;

import com.aki.designpattern.行为型.命令模式.action.Background;
import com.aki.designpattern.行为型.命令模式.action.Font;
import com.aki.designpattern.行为型.命令模式.command.*;

public class TestMain {
    public static void main(String[] args) {
        Font font = new Font();
        Background background = new Background();

        NormalFontCommand normalFontCommand = new NormalFontCommand(font);
        LargeFontCommand largeFontCommand = new LargeFontCommand(font);
        DefaultBackground defaultBackground = new DefaultBackground(background);
        CustomBackground customBackground = new CustomBackground(background);

        Invoker invoker = new Invoker();
        invoker.setCommand(0, normalFontCommand);
        invoker.setCommand(1, largeFontCommand);
        invoker.setCommand(2, defaultBackground);
        invoker.setCommand(3, customBackground);

        invoker.update(3);

        System.out.println(background.getBgColor());
    }
}
