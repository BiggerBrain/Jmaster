package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._269;

public class _269Test {
    private static _269.Solution1 solution1;
    private static String[]       words;

    @BeforeClass
    public static void setup() {
        solution1 = new _269.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] { "wrt", "wrf", "er", "ett", "rftt" };
        assertEquals("wertf", solution1.alienOrder(words));
    }

}
