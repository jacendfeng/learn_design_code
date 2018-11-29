package com.jacend.trygroovy;

/**
 * @author fengxf
 * @since 2018-10-10
 */
abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}

class Authtor extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}

public class Programmer extends Writer{

    public static void write() {
        System.out.println("writing code");
    }


    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
    }
}
