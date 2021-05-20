package com.aki.designpattern.行为型.访问者模式;

import com.aki.designpattern.行为型.访问者模式.element.Element;
import com.aki.designpattern.行为型.访问者模式.elementVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式，员工管理类，只需管理所有员工的集合对象，若外部需要获取员工信息，则只需通过访问方法获取员工信息进行自定义操作
 */
public class Employees {
    private List<Element> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void Attach(Element element) {
        employees.add(element);
    }

    public void Detach(Element element) {
        employees.remove(element);
    }

    public Element getEmployee(int i) {
        return employees.get(i);
    }

    public void Accept(Visitor visitor) {
        for (Element e : employees) {
            e.Accept(visitor);
        }
    }
}
