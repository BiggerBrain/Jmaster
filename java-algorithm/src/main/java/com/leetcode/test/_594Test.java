package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._594;

/**
 * Created by fishercoder on 5/20/17.
 */
public class _594Test {
    private static _594.Solution1 solution1;
    private static int[]          nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _594.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 1, 3, 2, 2, 5, 2, 3, 7 };
        assertEquals(5, solution1.findLHS(nums));
    }
}
