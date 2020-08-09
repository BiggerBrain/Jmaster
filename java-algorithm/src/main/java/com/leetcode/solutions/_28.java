package com.leetcode.solutions;

/**
 * 28. Implement strStr()
 *
 * Implement strStr().
 *
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class _28 {

    public static class Solution1 {
        public int strStr(String haystack, String needle) {
            if (haystack == null || needle == null || haystack.length() < needle.length()) {
                return -1;
            }

            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
            return -1;
        }
    }

}
