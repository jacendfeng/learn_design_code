package com.jacend.binarySearch;

/**
 * 首先是有序的
 * <p>
 * 二分查找
 * 1. 二分查找依赖的顺序结构，简单的说是数组（支持按照下标随机访问）
 * 2. 二分查找以来的是有序顺序表结构，数据不能老被打乱
 * 3. 数据量太小不适合二分查找 （优势体现不出来，但是如果比较操作本身比较耗时，还是推荐的）
 * 4. 数据量太大不适合二分查找 1GB 大小数据就需要 1GB 连续内存空间（数组）
 *
 * @author fengxf
 * @since 2019-02-19
 */
public class BinarySearch {

    /**
     * 循环迭代实现
     * @param a 待查找 int 数组
     * @param n int 数组长度
     * @param value 待查找的数
     * @return 查到则返回对应的数组下标，查不到返回 -1
     */
    public static int s1(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;

        // 循环终止条件容易搞错，<= 因为最终 low high 共同指向的最后元素也需要比较
        while (low <= high) {
            // 考虑溢出的话
            // int mid  = low + (high - low) / 2
            // 或者更加搞笑一点移位 low + (high - low) >> 1
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1; // mid 已经在上一次比较过了
            } else {
                low = mid + 1; // mid 已经在上一次比较过了
            }
        }

        return -1;
    }


    /**
     * 递归实现
     * @param a 待查找 int 数组
     * @param n int 数组长度
     * @param val 待查找的数
     * @return 查到则返回对应的数组下标，查不到返回 -1
     */
    public static int bsearch(int[] a, int n, int val) {
        return bsearchInternally(a, 0, n - 1, val);
    }

    private static int bsearchInternally(int[] a, int low, int high, int value) {
        if (low > high) return -1;

        int mid =  low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] < value) {
            return bsearchInternally(a, mid+1, high, value);
        } else {
            return bsearchInternally(a, low, mid-1, value);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int pos = s1(nums, nums.length, 4);
        System.out.println(nums[pos]);
    }
}