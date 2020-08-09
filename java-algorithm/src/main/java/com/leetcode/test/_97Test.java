package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._97;

public class _97Test {
    private static _97.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _97.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

}
