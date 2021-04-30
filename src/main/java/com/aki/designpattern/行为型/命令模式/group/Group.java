package com.aki.designpattern.行为型.命令模式.group;

/**
 * @description: 项目组分成了三个组，每个组要接受增删改的命令
 */
public abstract class Group {

    public abstract void add();
    public abstract void delete();
    public abstract void change();
    public abstract void find(); // 客户要和某个小组沟通，必须先找到对应的小组
    public abstract void plan(); // 客户要求某小组列出执行计划

}
