package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1409;

public class _1409Test {
    private static _1409.Solution1 solution1;
    private static int[]           queries;

    @BeforeClass
    public static void setup() {
        solution1 = new _1409.Solution1();
    }

    @Test
    public void test1() {
        queries = new int[] { 3, 1, 2, 1 };
        assertArrayEquals(new int[] { 2, 1, 2, 1 }, solution1.processQueries(queries, 5));
    }

}