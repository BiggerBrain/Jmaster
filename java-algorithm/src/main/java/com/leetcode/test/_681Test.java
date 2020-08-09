package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._681;

public class _681Test {
    private static _681.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _681.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("19:39", solution1.nextClosestTime("19:34"));
    }

}