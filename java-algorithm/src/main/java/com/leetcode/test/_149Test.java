package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._149;

public class _149Test {
    private static _149.Solution1 solution1;
    private static int[][]        points;

    @BeforeClass
    public static void setup() {
        solution1 = new _149.Solution1();
    }

    @Test
    public void test1() {
        points = new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } };
        assertEquals(3, solution1.maxPoints(points));
    }
}
