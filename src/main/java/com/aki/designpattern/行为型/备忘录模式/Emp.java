package com.aki.designpattern.行为型.备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发起人
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
