package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._132;

public class _132Test {
    private static _132.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _132.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minCut("aab"));
    }
}
