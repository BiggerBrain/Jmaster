package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._300;

public class _300Test {

    private static _300.Solution1 solution1;
    private static int[]          nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _300.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
        assertEquals(4, solution1.lengthOfLIS(nums));

    }

}