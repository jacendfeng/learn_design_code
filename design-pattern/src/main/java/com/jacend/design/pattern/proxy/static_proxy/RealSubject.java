package com.jacend.design.pattern.proxy.static_proxy;

/**
 * 真实主题类
 *
 * @author fengxf
 * @since 2018-09-10
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("request!!");
    }
}
