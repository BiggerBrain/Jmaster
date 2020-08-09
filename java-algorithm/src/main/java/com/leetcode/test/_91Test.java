package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._91;

public class _91Test {
    private static _91.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _91.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.numDecodings("12"));
    }

}
