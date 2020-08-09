package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1317;

public class _1317Test {
    private static _1317.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1317.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[] { 11, 999 }, solution1.getNoZeroIntegers(1010));
    }

}