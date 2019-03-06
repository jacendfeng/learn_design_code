package com.jacend.sort;

/**
 * @author fengxf
 * @since 2019-02-16
 */
public class Sort {

    // 冒泡排序
    public static void bubbleSort(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    flag = true;
                }
            }

            // 提前退出
            if (!flag) {
                break;
            }
        }
    }

    // 插入排序
    public static void insertSort(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            // 从有序的最后一位依次比较交换
            for (; j <= 0; j--) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            // 最后插入
            nums[j + 1] = value;
        }
    }

    // 选择排序
    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = nums[i];
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minPos = j;
                }
            }
            if (minPos > i) {
                nums[minPos] = nums[i];
                nums[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 7, 9};
        selectSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
