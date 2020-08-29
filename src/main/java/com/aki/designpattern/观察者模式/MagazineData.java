package com.aki.designpattern.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class MagazineData implements Observerable {

    private List<Observer> mObservers;
    private int edition;
    private float cost;

    public MagazineData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = mObservers.indexOf(o);
        if(i >= 0)
            mObservers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < mObservers.size(); i++){
            Observer observer = mObservers.get(i);
            observer.update(edition, cost);
        }
    }

    public void setInfomation(int edition,float cost){
        this.edition = edition;
        this.cost = cost;
        //信息更新完毕，通知所有观察者
        notifyObservers();
    }

}
