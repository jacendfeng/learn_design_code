package com.jacend.stack;

/**
 * 基于数组实现的顺序栈
 *
 * @author fengxf
 * @since 2019-03-13
 */
public class ArrayStack {

    // 数组
    private int[] nums;

    // 栈中元素多少
    private int count;

    // 栈的大小
    private int n;

    public ArrayStack(int n) {
        nums = new int[n];
    }

    public boolean push(int x) {
        if (count == n) {
            throw new IllegalArgumentException("stack is full");
        }
        nums[count] = x;
        count += 1;
        return true;
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalArgumentException("");
        }
        count -= 1;
        return nums[count];
    }

    public static void main(String[] args) {
        int count = 4;
        count -= 2;
        System.out.println(count);
        int[] nums = new int[]{1,2};
        System.out.println(nums.length);
    }
}
