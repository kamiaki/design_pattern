package com.aki.designpattern.结构型.装饰者模式;

public abstract class Sweet {
    String description = "Sweet";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
