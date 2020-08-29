package com.aki.designpattern.复合模式;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public abstract Entry add(Entry entry);

    public void printList() {
        printList("");
    }
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
