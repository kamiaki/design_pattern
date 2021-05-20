package com.aki.designpattern.行为型.迭代器模式;

//抽象迭代器
interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
