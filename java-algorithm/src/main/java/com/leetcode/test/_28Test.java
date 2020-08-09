package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.solutions._28;

public class _28Test {
    private static _28.Solution1 solution1;

    @Before
    public void setupForEachTest() {
        solution1 = new _28.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.strStr("a", ""));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.strStr("mississippi", "a"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.strStr("a", "a"));
    }
}
