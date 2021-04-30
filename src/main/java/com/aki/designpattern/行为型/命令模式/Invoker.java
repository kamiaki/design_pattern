package com.aki.designpattern.行为型.命令模式;

import com.aki.designpattern.行为型.命令模式.Command.Command;

public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }

}
