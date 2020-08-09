package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._806;

public class _806Test {
    private static _806.Solution1 solution1;
    private static int[]          widths;

    @BeforeClass
    public static void setup() {
        solution1 = new _806.Solution1();
    }

    @Test
    public void test1() {
        widths = new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                             10, 10, 10, 10, 10, 10, 10, 10 };
        assertArrayEquals(new int[] { 3, 60 },
            solution1.numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        widths = new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                             10, 10, 10, 10, 10, 10, 10, 10 };
        assertArrayEquals(new int[] { 2, 4 }, solution1.numberOfLines(widths, "bbbcccdddaaa"));
    }
}
