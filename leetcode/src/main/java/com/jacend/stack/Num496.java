package com.jacend.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

/**
 * 给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * <p>
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * 输出: [-1,3,-1]
 * 解释:
 * 对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
 * 对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
 * 对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。
 * 示例 2:
 * <p>
 * 输入: nums1 = [2,4], nums2 = [1,2,3,4].
 * 输出: [3,-1]
 * 解释:
 * 对于num1中的数字2，第二个数组中的下一个较大数字是3。
 * 对于num1中的数字4，第二个数组中没有下一个更大的数字，因此输出 -1。
 * 注意:
 * <p>
 * nums1和nums2中所有元素是唯一的。
 * nums1和nums2 的数组大小都不超过1000。
 *
 * @author fengxf
 * @since 2018-10-17
 */
public class Num496 {

    // 1. 这个等于说是暴力破解
    // 2. 空间换时间 map 存放 num2 key:值 value: 位置， 然后循环遍历 nums1，可以节省点时间

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            boolean flag = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    flag = true;
                }

                if (nums1[i] < nums2[j] && flag) {
                    result[i] = nums2[j];
                    flag = false;
                    break;
                }
            }

            if (flag) {
                result[i] = -1;
            }
        }

        return result;
    }

//    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
//        Vector<Integer> res;
//        Stack<Integer> st = new Stack<>();
//        Map<Integer, Integer> m = new HashMap<>();
//
//        for (int num : nums) {
//            while (!st.empty() && st.peek() < num) {
//                m.put(st.peek(), num);
//                st.pop();
//            }
//            st.push(num);
//        }
//
//        for (int num : findNums) {
//            res.push_back(m.count(num) ? m[num] : -1);
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
        Num496 num496 = new Num496();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(num496.nextGreaterElement(nums1,nums2)) );
    }
}
