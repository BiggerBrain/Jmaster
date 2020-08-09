package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._338;

import common.utils.CommonUtils;

public class _338Test {
    private static _338.Solution1 test;
    private static int[]          expected;
    private static int[]          actual;

    @BeforeClass
    public static void setup() {
        test = new _338.Solution1();
    }

    @Test
    public void test1() {
        expected = new int[] { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
        actual = test.countBits(15);
        CommonUtils.printArray(actual);
        assertArrayEquals(expected, actual);
    }
}
