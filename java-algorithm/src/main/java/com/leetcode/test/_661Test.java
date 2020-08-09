package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._661;

public class _661Test {
    private static _661.Solution1 solution1;
    private static int[][]        M;
    private static int[][]        expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _661.Solution1();
    }

    @Test
    public void test1() {
        M = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        expected = M = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        assertArrayEquals(expected, solution1.imageSmoother(M));
    }

}
