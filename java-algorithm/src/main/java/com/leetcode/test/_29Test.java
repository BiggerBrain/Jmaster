package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._29;

public class _29Test {
    private static _29.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _29.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.divide(4, 3));
    }
}
