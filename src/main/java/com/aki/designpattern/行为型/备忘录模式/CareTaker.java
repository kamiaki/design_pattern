package com.aki.designpattern.行为型.备忘录模式;

import lombok.Data;

/**
 * 管理者
 */
@Data
public class CareTaker {
    private EmpMemento empMemento;
//    private List<EmpMemento> list = new ArrayList<EmpMemento>();    // 如果需要存储多个备份,可以使用集合
}
