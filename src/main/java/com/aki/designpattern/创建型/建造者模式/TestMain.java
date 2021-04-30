package com.aki.designpattern.创建型.建造者模式;


public class TestMain {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Director director = new Director();

            ComputerBuilder hp = new HPComputerBuilder();

            director.setComputerBuilder(hp);

            director.constructComputer();

        //get the pc
        Computer pc = director.getComputer();

    }
}
