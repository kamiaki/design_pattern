package com.aki.designpattern.行为型.命令模式.Command;

public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }

}
