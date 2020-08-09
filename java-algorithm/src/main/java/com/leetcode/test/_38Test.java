package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._38;

public class _38Test {
    private static _38.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _38.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("21", solution1.countAndSay(3));
    }
}
