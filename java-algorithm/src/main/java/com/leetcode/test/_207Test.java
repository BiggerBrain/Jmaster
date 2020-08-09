package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._207;

public class _207Test {
    private static _207.Solution1 test;
    private static boolean        actual;
    private static boolean        expected;
    private static int[][]        prerequisites;
    private static int            numCourses;

    @BeforeClass
    public static void setup() {
        test = new _207.Solution1();
    }

    @Test
    public void test1() {
        numCourses = 2;
        prerequisites = new int[][] { { 0, 1 } };
        expected = true;
        actual = test.canFinish(numCourses, prerequisites);
        assertEquals(expected, actual);
    }
}
