package com.jacend.design.pattern.proxy.dynamic_proxy;

import java.util.Random;

/**
 * @author fengxf
 * @since 2018-09-11
 */
public class Bird implements Flyable {

    @Override
    public void fly() {
        long start = System.currentTimeMillis();

        System.out.println("Bird is flying...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Fly time = " + (end - start));
    }
}
