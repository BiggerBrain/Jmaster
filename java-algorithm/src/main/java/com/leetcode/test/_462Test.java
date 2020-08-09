package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._462;

public class _462Test {
    private static _462.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _462.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minMoves2(new int[] { 1, 2, 3 }));
    }

}