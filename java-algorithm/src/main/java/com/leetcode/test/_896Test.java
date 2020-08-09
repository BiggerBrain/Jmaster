package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._896;

public class _896Test {
    private static _896.Solution1 solution1;
    private static int[]          A;

    @BeforeClass
    public static void setup() {
        solution1 = new _896.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] { 1, 3, 2 };
        assertEquals(false, solution1.isMonotonic(A));
    }

}
