package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._5;

public class _5Test {
    private static _5.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _5.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("bab", solution1.longestPalindrome("babad"));
    }

}