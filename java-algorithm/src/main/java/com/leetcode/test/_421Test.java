package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._421;

public class _421Test {
    private static _421.Solution1 solution1;
    private static int            expected;
    private static int            actual;
    private static int[]          nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _421.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 3, 10, 5, 25, 2, 8 };
        expected = 28;
        actual = solution1.findMaximumXOR(nums);
        assertEquals(expected, actual);
    }
}
