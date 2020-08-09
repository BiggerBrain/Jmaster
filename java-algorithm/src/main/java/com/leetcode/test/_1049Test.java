package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1049;

public class _1049Test {
    private static _1049.Solution1 solution1;
    private static int[]           stones;

    @BeforeClass
    public static void setup() {
        solution1 = new _1049.Solution1();
    }

    @Test
    public void test1() {
        stones = new int[] { 2, 7, 4, 1, 8, 1 };
        assertEquals(1, solution1.lastStoneWeightII(stones));
    }

}
