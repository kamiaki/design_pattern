package com.aki.designpattern.结构型.组合模式;

public abstract class LessonModal {
    protected String name;

    public String getName() {
        return name;
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void add(LessonModal modal) {
        throw new UnsupportedOperationException();
    }

    public void remove(LessonModal modal) {
        throw new UnsupportedOperationException();
    }

    public LessonModal getChild() {
        throw new UnsupportedOperationException();
    }
}
