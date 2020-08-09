package com.leetcode.solutions;

/**
 * 12. Integer to Roman
 *
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class _12 {

    public static class Solution1 {
        public String intToRoman(int num) {
            String[] M = new String[] { "", "M", "MM", "MMM" };
            String[] C = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
            String[] X = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
            String[] I = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
            return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
        }
    }

}
