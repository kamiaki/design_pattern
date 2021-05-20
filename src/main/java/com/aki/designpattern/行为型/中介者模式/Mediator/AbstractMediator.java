package com.aki.designpattern.行为型.中介者模式.Mediator;

import com.aki.designpattern.行为型.中介者模式.colleague.AbstractColleague;

public abstract class AbstractMediator {
    public abstract void operate(AbstractColleague colleague, String message);
}
