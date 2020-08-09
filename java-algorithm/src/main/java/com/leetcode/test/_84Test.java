package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._84;

public class _84Test {
    private static _84.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _84.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, (solution1.largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 })));
    }

}
