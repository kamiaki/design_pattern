package com.aki.designpattern.行为型.观察者模式;

public interface Observerable {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
