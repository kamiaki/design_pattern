package com.aki.designpattern.行为型.访问者模式.elementVisitor;

import com.aki.designpattern.行为型.访问者模式.element.Element;
import com.aki.designpattern.行为型.访问者模式.element.Employee;

/**
 * 访问者模式，计算薪资的访问者，实现访问者的接口，实现访问方法
 * 新的访问者若有新需求拓展只需实现访问自定义的操作方法即可
 */
public class CompensationVisitor implements Visitor {

    @Override
    public void Visit(Element element) {
        Employee employee = ((Employee) element);

        System.out.println(employee.getName() + "'s Compensation is "
                + (employee.getDegree() * employee.getVacationDays() * 10));
    }

}
