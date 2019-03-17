package com.jacend.jdk.concurrent;

/**
 * @author fengxf
 * @since 2019-03-17
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread();
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("hello My thread");
        }
    }
}
