package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1342;

public class _1342Test {
    private static _1342.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1342.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.numberOfSteps(123));
    }

    @Test
    public void test2() {
        assertEquals(6, solution1.numberOfSteps(14));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.numberOfSteps(8));
    }

}