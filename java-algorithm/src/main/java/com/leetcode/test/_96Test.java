package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._96;

public class _96Test {
    private static _96.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _96.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.numTrees(3));
    }

}
