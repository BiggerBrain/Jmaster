package com.leetcode.solutions;

/**
 * 275. H-Index II
 *
 * Follow up for H-Index: What if the citations array is sorted in ascending order?
 * Could you optimize your algorithm?
 */
public class _275 {
    public static class Solution1 {
        public int hIndex(int[] citations) {
            int left = 0;
            int len = citations.length;
            int right = len - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (citations[mid] >= (len - mid)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return len - left;
        }
    }
}
