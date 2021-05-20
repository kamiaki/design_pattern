package com.aki.designpattern.行为型.迭代器模式;

//抽象聚合
interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
