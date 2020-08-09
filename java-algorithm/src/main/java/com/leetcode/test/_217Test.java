package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._217;

public class _217Test {
    private static _217.Solution1 solution1;
    private static int[]          nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _217.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 1, 2, 3, 4, 3 };
        assertEquals(true, solution1.containsDuplicate(nums));
    }
}
