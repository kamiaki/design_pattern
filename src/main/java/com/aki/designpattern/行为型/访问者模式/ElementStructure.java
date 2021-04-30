package com.aki.designpattern.行为型.访问者模式;

import com.aki.designpattern.行为型.访问者模式.element.Element;
import com.aki.designpattern.行为型.访问者模式.elementVisitor.ElementVisitor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//单独还定义对象结构，其实完全就可以使用列表就可以
@Data
public class ElementStructure {

    private List<Element> list = new ArrayList<>();

    public void addElement(Element element) {
        list.add(element);
    }

    public void accept(ElementVisitor visitor) {
        for (Element elem : list) {
            elem.accept(visitor);
        }
    }
}
