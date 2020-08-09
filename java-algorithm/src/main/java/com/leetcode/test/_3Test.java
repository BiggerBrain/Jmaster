package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._3;

public class _3Test {
    private static _3.Solution1 solution1;
    private static _3.Solution2 solution2;
    private static _3.Solution3 solution3;
    private static _3.Solution4 solution4;

    @BeforeClass
    public static void setup() {
        solution1 = new _3.Solution1();
        solution2 = new _3.Solution2();
        solution3 = new _3.Solution3();
        solution4 = new _3.Solution4();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution2.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution4.lengthOfLongestSubstring("abcabcbb"));
    }

}