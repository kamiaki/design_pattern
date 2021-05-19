package com.aki.designpattern.结构型.桥接模式.abs;

import com.aki.designpattern.结构型.桥接模式.qiao.Qiao;

public abstract class AreaA {

    //引用桥接口
    public Qiao qiao;

    //来源地
    abstract public void fromAreaA();

}
