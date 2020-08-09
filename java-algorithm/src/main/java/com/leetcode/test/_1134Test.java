package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1134;

public class _1134Test {
    private static _1134.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1134.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isArmstrong(153));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isArmstrong(123));
    }
}
