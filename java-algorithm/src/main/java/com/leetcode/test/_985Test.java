package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._985;

public class _985Test {
    private static _985.Solution1 solution1;
    private static int[]          expected;
    private static int[]          actual;
    private static int[]          A;
    private static int[][]        queries;

    @BeforeClass
    public static void setup() {
        solution1 = new _985.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] { 1, 2, 3, 4 };
        queries = new int[][] { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
        expected = new int[] { 8, 6, 2, 4 };
        actual = solution1.sumEvenAfterQueries(A, queries);
        assertArrayEquals(expected, actual);
    }
}
