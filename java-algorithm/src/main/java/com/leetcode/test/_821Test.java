package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._821;

public class _821Test {
    private static _821.Solution1 solution1;
    private static int[]          expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _821.Solution1();
    }

    @Test
    public void test1() {
        expected = new int[] { 3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0 };
        assertArrayEquals(expected, solution1.shortestToChar("loveleetcode", 'e'));
    }
}
