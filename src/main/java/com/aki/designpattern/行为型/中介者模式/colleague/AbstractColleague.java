package com.aki.designpattern.行为型.中介者模式.colleague;

import com.aki.designpattern.行为型.中介者模式.Mediator.AbstractMediator;
import lombok.Data;

/**
 * 抽象的 房东租客 里面拿到中介
 */
@Data
public abstract class AbstractColleague {
    //持有中介者对象
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
