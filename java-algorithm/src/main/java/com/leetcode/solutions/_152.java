package com.leetcode.solutions;

/**
 * 152. Maximum Product Subarray

 Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.
 */
public class _152 {
    public static class Solution1 {
        public int maxProduct(int[] nums) {
            int pos = nums[0];
            int neg = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int temp = pos;
                pos = Math.max(nums[i], nums[i] * ((nums[i] >= 0) ? pos : neg));
                neg = Math.min(nums[i], nums[i] * ((nums[i] >= 0) ? neg : temp));
                max = Math.max(max, pos);
            }
            return max;
        }
    }
}
