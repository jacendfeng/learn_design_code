package com.jacend.sort;

/**
 * @author fengxf
 * @since 2019-02-18
 */
public class MergeSort {

    public static void mergeSort(int[] nums, int p, int r) {
        if (p >= r) {
            return;
        }

        int q = (p + r) / 2;
        mergeSort(nums, p, q);
        mergeSort(nums, q + 1, r);
        merge(nums, p, q, r);
    }

    public static void merge(int[] nums, int p, int q, int r) {
        // 初始化变量 i, j, k
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] tmp = new int[r - p + 1]; // 申请一个大小跟 A[p...r] 一样的临时数组

        while (i <= q && j <= r) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++]; // i++ 等于 i:=i+1
            } else {
                tmp[k++] = nums[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组 tmp
        while (start <= end) {
            tmp[k++] = nums[start++];
        }

        // 将 tmp 中的数组拷贝回 A[p...r]
        for (int f = 0; f < r - p; f++) {
            nums[p + f] = tmp[f];
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 7, 9};
        mergeSort(nums, 0, nums.length);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
