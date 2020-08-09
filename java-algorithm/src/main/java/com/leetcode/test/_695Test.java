package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.solutions._695;

public class _695Test {
    private static _695.Solution1 solution1;
    private static int[][]        grid;

    @Before
    public void setup() {
        solution1 = new _695.Solution1();
    }

    @Test
    public void test1() {
        grid = new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                             { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                             { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                             { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                             { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                             { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                             { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                             { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        assertEquals(6, solution1.maxAreaOfIsland(grid));
    }

}
