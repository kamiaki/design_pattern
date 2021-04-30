package com.aki.designpattern.行为型.备忘录模式;

public class TestMain {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("张三",20,2000);
        System.out.println("1.姓名:"+emp.getName()+";  年龄:"+emp.getAge()+";  薪水:"+emp.getSalary());

        taker.setEmpMemento(emp.memento());     // 备份
        emp.setName("李四");
        emp.setAge(30);
        emp.setSalary(6000);
        System.out.println("2.姓名:"+emp.getName()+";  年龄:"+emp.getAge()+";  薪水:"+emp.getSalary());

        emp.recovery(taker.getEmpMemento());      // 恢复
        System.out.println("3.姓名:"+emp.getName()+";  年龄:"+emp.getAge()+";  薪水:"+emp.getSalary());

    }
}
