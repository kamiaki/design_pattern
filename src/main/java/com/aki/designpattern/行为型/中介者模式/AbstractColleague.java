package com.aki.designpattern.行为型.中介者模式;

/**
 * 抽象的 房东租客 里面拿到中介
 */
public abstract class AbstractColleague {
    //持有中介者对象
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
