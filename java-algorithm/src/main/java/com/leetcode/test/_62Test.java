package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._62;

public class _62Test {
    private static _62.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _62.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.uniquePaths(1, 2));
    }
}
