package com.jacend.Chapter11;

import java.util.Arrays;
import java.util.List;

/**
 * @author fengxf
 * @since 2018-10-12
 */
public class ArraysTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2);
        list.add(3);
        System.out.println(list);
    }
}
