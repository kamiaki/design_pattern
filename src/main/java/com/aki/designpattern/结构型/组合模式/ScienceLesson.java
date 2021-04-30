package com.aki.designpattern.结构型.组合模式;

import java.util.ArrayList;
import java.util.Iterator;

public class ScienceLesson extends LessonModal {

    private ArrayList<LessonModal> lessons = new ArrayList<>();

    public ScienceLesson() {
        this.name = "ScienceLesson";
    }

    @Override
    public void add(LessonModal modal) {
        lessons.add(modal);
    }

    @Override
    public void remove(LessonModal modal) {
        lessons.remove(modal);
    }

    @Override
    public void print() {
        System.out.println(getName());

        Iterator<LessonModal> modalIterator = lessons.iterator();
        while (modalIterator.hasNext()) {
            LessonModal modal = modalIterator.next();
            System.out.print("\t");
            modal.print();
        }
    }
}
