package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._664;

public class _664Test {
    private static _664.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _664.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.strangePrinter("aaabbb"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.strangePrinter("aba"));
    }

}
