package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._11;

public class _11Test {
    private static _11.Solution1 solution1;
    private static int[]         height;

    @BeforeClass
    public static void setup() {
        solution1 = new _11.Solution1();
    }

    @Test
    public void test1() {
        height = new int[] { 1, 1 };
        assertEquals(1, solution1.maxArea(height));
    }

}