package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._45;

public class _45Test {
    private static _45.Solution1 solution1;
    private static int[]         nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _45.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 2, 3, 1, 1, 4 };
        assertEquals(2, solution1.jump(nums));
    }
}
