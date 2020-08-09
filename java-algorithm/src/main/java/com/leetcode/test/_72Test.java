package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._72;

public class _72Test {
    private static _72.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _72.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minDistance("Ada", "Adam"));
    }
}
