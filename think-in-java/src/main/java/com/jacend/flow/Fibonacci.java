package com.jacend.flow;

/**
 * @author fengxf
 * @since 2018-10-09
 */
public class Fibonacci {

    public static void tell(Integer count) {
        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 0; i < count; i++) {
            temp = a + b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }

    public static void say() {
        for (int i = 1001; i < 9999 ; i++) {
            if (i % 100 == 0) {
                continue;
            }
        }
    }

    public static void main(String[] args) throws Throwable {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.finalize();
    }
}
