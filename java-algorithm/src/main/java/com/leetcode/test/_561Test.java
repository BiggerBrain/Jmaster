package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._561;

/**
 * Created by fishercoder on 4/23/17.
 */
public class _561Test {
    private static _561.Solution1 solution1;
    private static int            expected;
    private static int            actual;
    private static int[]          nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _561.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 1, 4, 3, 2 };
        expected = 4;
        actual = solution1.arrayPairSum(nums);
        assertEquals(expected, actual);
    }

}
