package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._670;

public class _670Test {
    private static _670.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _670.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7236, solution1.maximumSwap(2736));
    }

    @Test
    public void test2() {
        assertEquals(9973, solution1.maximumSwap(9973));
    }

    @Test
    public void test3() {
        assertEquals(73236, solution1.maximumSwap(23736));
    }

    @Test
    public void test4() {
        assertEquals(98213, solution1.maximumSwap(91283));
    }

}
