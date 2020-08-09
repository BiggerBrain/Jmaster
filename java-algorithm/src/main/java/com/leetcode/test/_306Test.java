package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._306;

public class _306Test {
    private static _306.Solution1 solution1;
    private static String         num;

    @BeforeClass
    public static void setup() {
        solution1 = new _306.Solution1();
    }

    @Test
    public void test1() {
        num = "0235813";
        assertEquals(false, solution1.isAdditiveNumber(num));
    }

    @Test
    public void test2() {
        num = "000";
        assertEquals(true, solution1.isAdditiveNumber(num));
    }

    @Test
    public void test3() {
        num = "011235";
        assertEquals(true, solution1.isAdditiveNumber(num));
    }
}
