package com.aki.designpattern.行为型.解释器模式;

import com.aki.designpattern.行为型.解释器模式.Expression.Variable;

import java.util.HashMap;
import java.util.Map;

//上下文（环境）角色，使用HashMap来存储变量对应的数值
public class Context {

    private Map valueMap = new HashMap();

    public void addValue(Variable x, int y) {
        Integer yi = new Integer(y);
        valueMap.put(x, yi);
    }

    public int LookupValue(Variable x) {
        int i = ((Integer) valueMap.get(x)).intValue();
        return i;
    }
}
