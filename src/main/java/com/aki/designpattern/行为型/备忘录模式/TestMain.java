package com.aki.designpattern.行为型.备忘录模式;

public class TestMain {
    public static void main(String[] args) {
        // 创建管理者
        CareTaker taker = new CareTaker();

        // 创建员工
        Emp emp = new Emp("张三", 20, 2000);
        System.out.println("1.姓名:" + emp.getName() + ";  年龄:" + emp.getAge() + ";  薪水:" + emp.getSalary());

        // 备份到管理者
        taker.setEmpMemento(emp.memento());

        // 设置为下一个人
        emp.setName("李四");
        emp.setAge(30);
        emp.setSalary(6000);
        System.out.println("2.姓名:" + emp.getName() + ";  年龄:" + emp.getAge() + ";  薪水:" + emp.getSalary());

        // 恢复到备份的
        emp.recovery(taker.getEmpMemento());
        System.out.println("3.姓名:" + emp.getName() + ";  年龄:" + emp.getAge() + ";  薪水:" + emp.getSalary());
    }
}
