package com.jacend.array;

/**
 * 给定一个
 * 排序数组，
 * 你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在
 * 使用 O(1) 额外空间的条件下完成
 *
 * @author fengxf
 * @since 2019-02-16
 */
public class Num26 {

    public static int removeDuplicates(int[] nums) {
        // 数组长度
        int length = nums.length;
        if (length == 1) {
            return 1;
        }

        // 总重复数目
        int duplicateCount = 0;

        for (int i = 0; i < length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                duplicateCount++;
                continue;
            }

            if (duplicateCount > 0) {
                nums[i + 1 - duplicateCount] = nums[i + 1];
            }
        }

        return length - duplicateCount;
    }

    // 双指针
    public static int removeDuplicates2(int[] nums) {
        // 边界判断
        if (nums.length == 0) {
            return 0;
        }

        // 表示最新有效的数组下标
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }
}
