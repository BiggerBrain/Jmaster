package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._566;

/**
 * Created by fishercoder on 4/29/17.
 */
public class _566Test {
    private static _566.Solution1 solution1;
    private static int[][]        expected;
    private static int[][]        actual;
    private static int[][]        nums;
    private static int            r;
    private static int            c;

    @BeforeClass
    public static void setup() {
        solution1 = new _566.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[][] { { 1, 2 }, { 3, 4 }, };
        r = 1;
        c = 4;
        expected = new int[][] { { 1, 2, 3, 4 } };
        actual = solution1.matrixReshape(nums, r, c);
        assertArrayEquals(expected, actual);
    }
}
