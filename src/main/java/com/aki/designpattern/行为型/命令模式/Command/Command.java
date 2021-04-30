package com.aki.designpattern.行为型.命令模式.Command;

import com.aki.designpattern.行为型.命令模式.group.CodeGroup;
import com.aki.designpattern.行为型.命令模式.group.PageGroup;
import com.aki.designpattern.行为型.命令模式.group.RequirementGroup;

public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    // 只要一个方法，你要我做什么事情
    public abstract void execute();

}
