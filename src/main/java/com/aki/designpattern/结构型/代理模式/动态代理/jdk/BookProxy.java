package com.aki.designpattern.结构型.代理模式.动态代理.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用java本生的代理对象需要用到，接口类，实现类
 *
 * @author yellowcong
 * @data 2017/08/31
 */
class BookProxy implements InvocationHandler {
    private Object target;

    public BookProxy(Object target) {
        super();
        this.target = target;
    }

    /**
     * 将Object绑定到当前的对象上
     *
     * @return
     */
    public Object getProxy() {
        //初始化代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            System.out.println("proxy before");
            result = method.invoke(this.target, args);
            System.out.println("proxy end");
        } finally {

        }
        return result;
    }

}
