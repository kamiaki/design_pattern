package com.aki.designpattern.行为型.访问者模式;

import com.aki.designpattern.行为型.访问者模式.element.Employee;
import com.aki.designpattern.行为型.访问者模式.element.Employee2;
import com.aki.designpattern.行为型.访问者模式.elementVisitor.CompensationVisitor;
import com.aki.designpattern.行为型.访问者模式.elementVisitor.CompensationVisitor2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMain {
    public static void main(String[] args) {
        // 针对 employee 集合，的处理方法
        Employees mEmployees = new Employees();
        mEmployees.Attach(new Employee("Tom", 4500, 8, 1));
        Employee jerry = new Employee("Jerry", 6500, 10, 2);
        mEmployees.Attach(jerry);
        mEmployees.Attach(new Employee("Jack", 9600, 12, 3));
        mEmployees.Detach(jerry);
        CompensationVisitor compensationVisitor = new CompensationVisitor();
        mEmployees.Accept(compensationVisitor);

        // 针对 employee2 集合，的处理方法2
        Employees mEmployees2 = new Employees();
        mEmployees2.Attach(new Employee2("Tom", 4500, 8, 1));
        mEmployees2.Attach(new Employee2("Jerry", 6500, 10, 2));
        Employee2 jack = new Employee2("Jack", 9600, 12, 3);
        mEmployees2.Attach(jack);
        mEmployees2.Detach(jack);
        CompensationVisitor2 compensationVisitor2 = new CompensationVisitor2();
        mEmployees2.Accept(compensationVisitor2);

    }
}
