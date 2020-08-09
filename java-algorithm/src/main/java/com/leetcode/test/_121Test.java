package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._121;

public class _121Test {
    private static _121.Solution1 solution1;
    private static int[]          prices;

    @BeforeClass
    public static void setup() {
        solution1 = new _121.Solution1();
    }

    @Test
    public void test1() {
        prices = new int[] { 7, 1, 5, 3, 6, 4 };
        assertEquals(5, solution1.maxProfit(prices));
    }

    @Test
    public void test2() {
        prices = new int[] { 7, 6, 4, 3, 1 };
        assertEquals(0, solution1.maxProfit(prices));
    }

    @Test
    public void test3() {
        prices = new int[] { 2, 4, 1 };
        assertEquals(2, solution1.maxProfit(prices));
    }

    @Test
    public void test4() {
        prices = new int[] { 1, 2 };
        assertEquals(1, solution1.maxProfit(prices));
    }
}
