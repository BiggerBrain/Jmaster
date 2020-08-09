package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._738;

public class _738Test {
    private static _738.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _738.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.monotoneIncreasingDigits(10));
    }

}