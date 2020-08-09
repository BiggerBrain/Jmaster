package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._852;

public class _852Test {
    private static _852.Solution1 solution1;
    private static int[]          A;

    @BeforeClass
    public static void setup() {
        solution1 = new _852.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] { 0, 1, 0 };
        assertEquals(1, solution1.peakIndexInMountainArray(A));
    }

    @Test
    public void test2() {
        A = new int[] { 0, 2, 1, 0 };
        assertEquals(1, solution1.peakIndexInMountainArray(A));
    }
}
