package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.solutions._694;

public class _694Test {
    private static _694.Solution1 solution1;
    private static _694.Solution2 solution2;
    private static int[][]        grid;

    @Before
    public void setup() {
        solution1 = new _694.Solution1();
        solution2 = new _694.Solution2();
    }

    @Test
    public void test1() {
        grid = new int[][] { { 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 },
                             { 1, 1, 0, 1, 1 } };
        //        assertEquals(3, solution1.numDistinctIslands(grid));
        assertEquals(3, solution2.numDistinctIslands(grid));
    }

    @Test
    public void test2() {
        grid = new int[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 },
                             { 0, 0, 0, 1, 1 } };
        //        assertEquals(1, solution1.numDistinctIslands(grid));
        assertEquals(1, solution2.numDistinctIslands(grid));
    }
}
