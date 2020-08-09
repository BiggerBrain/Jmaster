package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._50;

public class _50Test {
    private static _50.Solution1 solution1;
    private static _50.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _50.Solution1();
        solution2 = new _50.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1024.00000, solution1.myPow(2.00000, 10), 0.00001);
        assertEquals(1024.00000, solution2.myPow(2.00000, 10), 0.00001);
    }
}
