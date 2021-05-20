package com.aki.designpattern.结构型.代理模式.动态代理.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class BookDemoProxy implements MethodInterceptor {
    private Object target ;

    /**
     * 代理对象实例化的时候，就绑定代理
     * @param target
     */
    public BookDemoProxy(Object target  ) {
        this.target = target ;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxy() {
        return Enhancer.create(this.target.getClass(), this);
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object ret = null;

        System.out.println("proxy before");
        ret = method.invoke(this.target, args);
        System.out.println("proxy end");

        return ret;
    }

}
