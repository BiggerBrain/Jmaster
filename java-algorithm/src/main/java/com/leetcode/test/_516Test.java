package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._516;

public class _516Test {
    private static _516.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _516.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.longestPalindromeSubseq("bbbab"));
    }

}
