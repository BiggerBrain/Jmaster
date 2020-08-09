package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._80;

public class _80Test {
    private static _80.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _80.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, (solution1.removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 })));
    }

}
