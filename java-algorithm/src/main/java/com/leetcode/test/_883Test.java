package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._883;

public class _883Test {
    private static _883.Solution1 solution1;
    private static int[][]        grid;

    @BeforeClass
    public static void setup() {
        solution1 = new _883.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][] { { 2 } };
        assertEquals(5, solution1.projectionArea(grid));
    }

    @Test
    public void test2() {
        grid = new int[][] { { 1, 2 }, { 3, 4 }, };
        assertEquals(17, solution1.projectionArea(grid));
    }

}