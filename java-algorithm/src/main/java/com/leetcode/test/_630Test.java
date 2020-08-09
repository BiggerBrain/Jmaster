package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._630;

public class _630Test {
    private static _630.Solution1 solution1;
    private static int[][]        courses;

    @BeforeClass
    public static void setup() {
        solution1 = new _630.Solution1();
    }

    @Test
    public void test1() {
        courses = new int[][] { { 100, 200 }, { 200, 1300 }, { 1000, 1250 }, { 2000, 3200 },
                                { 300, 1200 } };
        assertEquals(4, solution1.scheduleCourse(courses));
    }

}