package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1300;

public class _1300Test {
    private static _1300.Solution1 solution1;
    private static int[]           arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1300.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[] { 4, 9, 3 };
        assertEquals(3, solution1.findBestValue(arr, 10));
    }

    @Test
    public void test2() {
        arr = new int[] { 2, 3, 5 };
        assertEquals(5, solution1.findBestValue(arr, 10));
    }

    @Test
    public void test3() {
        arr = new int[] { 60864, 25176, 27249, 21296, 20204 };
        assertEquals(11361, solution1.findBestValue(arr, 56803));
    }

}