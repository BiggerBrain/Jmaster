package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._473;

public class _473Test {
    private static _473.Solution1 solution1;
    private static int[]          nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _473.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 1, 1, 2, 2, 2 };
        assertEquals(true, solution1.makesquare(nums));
    }

    @Test
    public void test2() {
        nums = new int[] { 3, 3, 3, 3, 4 };
        assertEquals(false, solution1.makesquare(nums));
    }
}
