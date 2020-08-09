package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._76;

public class _76Test {
    private static _76.Solution1 solution1;
    private static int[]         nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _76.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("BANC", solution1.minWindow("ADOBECODEBANC", "ABC"));
    }
}
