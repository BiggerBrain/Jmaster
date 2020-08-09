package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._63;

public class _63Test {
    private static _63.Solution1 solution1;
    private static int[][]       obstacleGrid;

    @BeforeClass
    public static void setup() {
        solution1 = new _63.Solution1();
    }

    @Test
    public void test1() {
        obstacleGrid = new int[][] { { 0, 0 }, { 0, 1 }, };
        assertEquals(0, solution1.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void test2() {
        obstacleGrid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 }, };
        assertEquals(2, solution1.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void test3() {
        int[][] obstacleGrid = new int[][] { { 1, 0 } };
        assertEquals(0, solution1.uniquePathsWithObstacles(obstacleGrid));
    }
}
