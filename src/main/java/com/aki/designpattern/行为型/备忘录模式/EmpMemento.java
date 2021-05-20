package com.aki.designpattern.行为型.备忘录模式;

import lombok.Data;

/**
 * 备忘录
 */
@Data
public class EmpMemento {
    private String name;
    private int age;
    private double salary;

    public EmpMemento(Emp e) {
        this.name = e.getName();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }
}
