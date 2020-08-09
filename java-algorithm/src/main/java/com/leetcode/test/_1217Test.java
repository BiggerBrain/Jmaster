package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1217;

public class _1217Test {
    private static _1217.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1217.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minCostToMoveChips(new int[] { 1, 2, 3 }));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.minCostToMoveChips(new int[] { 2, 2, 2, 3, 3 }));
    }

}