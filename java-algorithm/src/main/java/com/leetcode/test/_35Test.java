package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._35;

public class _35Test {
    private static _35.Solution1 solution1;
    private static int[]         nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _35.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 1, 3, 5, 6 };
        assertEquals(2, solution1.searchInsert(nums, 5));
    }
}
