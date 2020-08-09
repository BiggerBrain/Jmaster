package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._762;

public class _762Test {
    private static _762.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _762.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.countPrimeSetBits(6, 10));
    }
}
