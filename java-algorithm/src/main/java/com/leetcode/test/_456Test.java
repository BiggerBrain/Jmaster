package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._456;

public class _456Test {
    private static _456.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _456.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.find132pattern(new int[] { -1, 3, 2, 0 }));

    }

}
