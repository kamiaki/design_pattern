package com.aki.designpattern.行为型.命令模式;

import com.aki.designpattern.行为型.命令模式.command.Command;

import java.util.ArrayList;

public class Invoker {

    private ArrayList<Command> commands;

    public Invoker() {
        commands = new ArrayList<>();
    }

    public void setCommand(int i, Command command) {
        commands.add(i, command);
    }

    public void update(int i) {
        commands.get(i).execute();
    }
}
