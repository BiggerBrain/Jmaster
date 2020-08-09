package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._976;

public class _976Test {

    private static _976.Solution1 test;

    @BeforeClass
    public static void setUp() {
        test = new _976.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, test.largestPerimeter(new int[] { 2, 1, 2 }));
    }

    @Test
    public void test2() {
        assertEquals(0, test.largestPerimeter(new int[] { 1, 2, 1 }));
    }

    @Test
    public void test3() {
        assertEquals(10, test.largestPerimeter(new int[] { 3, 2, 3, 4 }));
    }

    @Test
    public void test4() {
        assertEquals(8, test.largestPerimeter(new int[] { 3, 6, 2, 3 }));
    }
}
