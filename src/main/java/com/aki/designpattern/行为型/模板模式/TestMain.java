package com.aki.designpattern.行为型.模板模式;

public class TestMain {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
