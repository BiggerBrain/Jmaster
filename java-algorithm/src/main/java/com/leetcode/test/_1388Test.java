package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1388;

public class _1388Test {
    private static _1388.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1388.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(10, solution1.maxSizeSlices(new int[] { 1, 2, 3, 4, 5, 6 }));
    }

}