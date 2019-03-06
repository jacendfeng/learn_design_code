package com.jacend.array;

/**
 * 给定一个数组 nums 和一个值 val，
 * 你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * @author fengxf
 * @since 2019-02-16
 */
public class Num27 {

    public int removeElement(int[] nums, int val) {
        // 异常情况
        if (nums.length == 0) {
            return 0;
        }

        // 最新有效数组下标
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
