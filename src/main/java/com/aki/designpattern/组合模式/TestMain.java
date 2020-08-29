package com.aki.designpattern.组合模式;

public class TestMain {
    public static void main(String[] args) {
        LessonModal scienceLesson = new ScienceLesson();
        LessonModal biological = new Biological();
        LessonModal physical = new Biological2();
        LessonModal chemical = new Biological3();


        scienceLesson.add(biological);
        scienceLesson.add(physical);
        scienceLesson.add(chemical);

        scienceLesson.print();
    }
}
