package com.aki.designpattern.责任链模式;

public class Guangdong extends AbstractAction{

    private static final String type="广东";
    @Override
    public void todo(String type) {
        if(this.type.equals(type)){
          System.out.println("我是广东处理中心,我只处理广东的业务");
        }else{
            Action action = this.getAction();

            if (action != null) {
                action.todo(type);
            }else{
                super.todo(type);
            }
        }
    }
}
