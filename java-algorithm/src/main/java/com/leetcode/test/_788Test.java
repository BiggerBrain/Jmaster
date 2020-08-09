package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._788;

public class _788Test {
    private static _788.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _788.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.rotatedDigits(10));
    }
}
