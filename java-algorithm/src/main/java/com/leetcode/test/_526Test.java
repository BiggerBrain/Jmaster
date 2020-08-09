package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._526;

public class _526Test {
    private static _526.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _526.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countArrangement(2));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.countArrangement(3));
    }

}