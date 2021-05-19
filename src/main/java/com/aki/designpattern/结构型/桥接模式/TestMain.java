package com.aki.designpattern.结构型.桥接模式;

import com.aki.designpattern.结构型.桥接模式.abs.AreaA;
import com.aki.designpattern.结构型.桥接模式.abs.AreaA2;
import com.aki.designpattern.结构型.桥接模式.qiao.AreaB3;

public class TestMain {
    public static void main(String[] args) {
        AreaA a = new AreaA2();
        a.qiao = new AreaB3();
        a.fromAreaA();
        a.qiao.targetAreaB();
    }
}
