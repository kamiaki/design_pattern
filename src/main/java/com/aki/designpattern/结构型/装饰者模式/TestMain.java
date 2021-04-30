package com.aki.designpattern.结构型.装饰者模式;

public class TestMain {
    public static void main(String[] args) {
        Sweet cake = new Cake();
        System.out.println(cake.getDescription() + "总共花费" + cake.cost());

        FruitDecorator fruitDecorator = new FruitDecorator(cake);
        System.out.println(fruitDecorator.getDescription() + "总共花费" + fruitDecorator.cost());

        CandleDecorator candleDecorator = new CandleDecorator(fruitDecorator);
        System.out.println(candleDecorator.getDescription() + "总共花费" + candleDecorator.cost());
    }
}
