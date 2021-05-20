package com.aki.designpattern.行为型.访问者模式.element;

import com.aki.designpattern.行为型.访问者模式.elementVisitor.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工对象，继承超类，并实现访问者的注入
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Element {
    private String name;
    private float income;
    private int vacationDays;
    private int degree;

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
