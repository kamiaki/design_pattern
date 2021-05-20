package com.aki.designpattern.结构型.代理模式.动态代理.jdk;

/**
 * 作者:yellowcong
 * 日期:2017/08/30
 * 時間:17:08:21
 * 描述:
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        BookProxy proxy = new BookProxy(new BookServieImpl());
        BookServie book = (BookServie) proxy.getProxy();
        String result = book.add("Think in Java");
        System.out.println(result);
    }

}
