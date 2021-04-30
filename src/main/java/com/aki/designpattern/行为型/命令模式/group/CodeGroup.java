package com.aki.designpattern.行为型.命令模式.group;

/**
 * @description: 代码组
 */
public class CodeGroup extends Group {

    @Override
    public void add() {
        System.out.println("客户要求增加一个功能...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个功能...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改某个功能...");
    }

    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求列出代码变更计划...");
    }

}
