package com.jacend.design.pattern.proxy.static_proxy;

/**
 * @author fengxf
 * @since 2018-09-10
 */
public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {
        System.out.println("do before action");
    }

    private void after() {
        System.out.println("do after action");
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
