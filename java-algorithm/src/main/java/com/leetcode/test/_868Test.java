package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._868;

public class _868Test {
    private static _868.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _868.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.binaryGap(22));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.binaryGap(5));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.binaryGap(6));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.binaryGap(8));
    }
}
