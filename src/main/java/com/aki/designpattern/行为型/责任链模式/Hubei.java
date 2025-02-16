package com.aki.designpattern.行为型.责任链模式;

public class Hubei extends AbstractAction {
    private static final String type = "湖北";

    @Override
    public void todo(String type) {
        if (this.type.equals(type)) {
            System.out.println("我是湖北处理中心, 我只处理湖北的业务");
            System.out.println("处理完结==================================");
        } else {
            System.out.println("我是湖北处理中心, " + type + " 给下一个");
            Action action = this.getAction();
            if (action != null) {
                action.todo(type);
            } else {
                super.todo(type);
            }
        }
    }
}
