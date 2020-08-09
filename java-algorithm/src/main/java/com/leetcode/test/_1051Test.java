package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1051;

public class _1051Test {
    private static _1051.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1051.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));
    }

}