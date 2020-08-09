package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1385;

public class _1385Test {
    private static _1385.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1385.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2,
            solution1.findTheDistanceValue(new int[] { 4, 5, 8 }, new int[] { 10, 9, 1, 8 }, 2));
    }

}