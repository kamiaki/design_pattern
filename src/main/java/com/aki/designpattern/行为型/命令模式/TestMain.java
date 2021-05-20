package com.aki.designpattern.行为型.命令模式;

import com.aki.designpattern.行为型.命令模式.action.Background;
import com.aki.designpattern.行为型.命令模式.action.Font;
import com.aki.designpattern.行为型.命令模式.command.*;

public class TestMain {
    public static void main(String[] args) {
        // 字体 和 背景颜色
        Font font = new Font();
        Background background = new Background();

        // 新建若干条命令
        NormalFontCommand normalFontCommand = new NormalFontCommand(font);
        LargeFontCommand largeFontCommand = new LargeFontCommand(font);
        DefaultBackground defaultBackground = new DefaultBackground(background);
        CustomBackground customBackground = new CustomBackground(background);

        // 执行者接收到命令，并执行指定的命令
        Invoker invoker = new Invoker();
        invoker.setCommand(0, normalFontCommand);
        invoker.setCommand(1, largeFontCommand);
        invoker.setCommand(2, defaultBackground);
        invoker.setCommand(3, customBackground);
        invoker.update(3);

        // 查看执行结果
        System.out.println(background.getBgColor());
    }
}
