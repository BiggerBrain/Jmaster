package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._455;

public class _455Test {
    private static _455.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _455.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.findContentChildren(new int[] { 1, 2, 3 }, new int[] { 1, 1 }));

    }

    @Test
    public void test2() {
        assertEquals(2, solution1.findContentChildren(new int[] { 1, 2 }, new int[] { 1, 2, 3 }));

    }
}
