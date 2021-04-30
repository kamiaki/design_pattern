package com.aki.designpattern.行为型.命令模式.group;

/**
 * @description: 需求组
 */
public class RequirementGroup extends Group {

    @Override
    public void add() {
        System.out.println("客户要求增加一项需求...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项需求...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项需求...");
    }

    @Override
    public void find() {
        System.out.println("找到需求组...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求列出需求变更计划...");
    }

}
