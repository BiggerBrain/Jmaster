package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._161;

public class _161Test {
    private static _161.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _161.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isOneEditDistance("a", "ac"));
    }
}
