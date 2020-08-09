package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._479;

public class _479Test {
    private static _479.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _479.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(123, solution1.largestPalindrome(3));
    }
}
