package com.aki.designpattern.行为型.责任链模式;

public class beijing extends AbstractAction {
    private static final String type = "北京";

    @Override
    public void todo(String type) {
        if (this.type.equals(type)) {
            System.out.println("我是北京处理中心, 我只处理北京的业务");
            System.out.println("处理完结==================================");
        } else {
            System.out.println("我是北京处理中心, " + type + " 给下一个");
            Action action = this.getAction();
            if (action != null) {
                action.todo(type);
            } else {
                super.todo(type);
            }
        }
    }
}
