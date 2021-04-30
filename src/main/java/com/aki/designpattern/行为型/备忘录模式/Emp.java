package com.aki.designpattern.行为型.备忘录模式;

/**
 * 发起人
 */
public class Emp {
    private String name;
    private int age;
    private double salary;

    // 进行备份操作,返回备忘录对象
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    // 进行恢复操作
    public void recovery(EmpMemento empMemento){
        this.name = empMemento.getName();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
