package com.jacend.design.pattern.proxy.dynamic_proxy;

/**
 * @author fengxf
 * @since 2018-09-11
 */
public class Client {

    public static void main(String[] args) {
        notRightMethod();

        // 使用继承来解决时间统计问题
        Client client = new Client();
        Bird2 bird2 = client.new Bird2();
        bird2.fly();
    }

    /**
     * 忽略了准备这些方法所需要的时间，执行一个方法，需要
     * 开辟栈空间、压栈、出栈
     */
    private static void notRightMethod() {
        Bird bird = new Bird();
        long start = System.currentTimeMillis();
        bird.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly time = " + (end - start));
    }

    /**
     * 通过继承来解决统计时间这个问题
     */
    class Bird2 extends Bird {

        @Override
        public void fly() {
            long start = System.currentTimeMillis();

            super.fly();

            long end = System.currentTimeMillis();
            System.out.println("Fly time = " + (end - start));
        }
    }

    /**
     * 通过聚合
     */
    class BirdProxy implements Flyable {

        private Bird bird;

        public BirdProxy(Bird bird) {
            this.bird = bird;
        }

        @Override
        public void fly() {
            long start = System.currentTimeMillis();

            bird.fly();

            long end = System.currentTimeMillis();
            System.out.println("Fly time = " + (end - start));
        }
    }


    /**
     * 通过聚合
     */
    class BirdTimeProxy implements Flyable {

        private Flyable flyable;

        public BirdTimeProxy(Flyable flyable) {
            this.flyable = flyable;
        }

        @Override
        public void fly() {
            long start = System.currentTimeMillis();

            flyable.fly();

            long end = System.currentTimeMillis();
        }
    }

    class BirdLogProxy implements Flyable {

        private Flyable flyable;

        public BirdLogProxy(Flyable flyable) {
            this.flyable = flyable;
        }

        @Override
        public void fly() {

            System.out.println("Bird fly start...");

            flyable.fly();

            System.out.println("Bird fly end...");
        }
    }
}
