package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._174;

public class _174Test {
    private static _174.Solution1 solution1;
    private int[][]               dungeon;

    @BeforeClass
    public static void setup() {
        solution1 = new _174.Solution1();
    }

    @Test
    public void test1() {
        dungeon = new int[][] { { 0 } };
        assertEquals(1, solution1.calculateMinimumHP(dungeon));
    }

    @Test
    public void test2() {
        dungeon = new int[][] { { -200 } };
        assertEquals(201, solution1.calculateMinimumHP(dungeon));
    }
}
