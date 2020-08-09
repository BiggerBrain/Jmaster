package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1180;

public class _1180Test {
    private static _1180.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1180.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.countLetters("aaaba"));
    }

    @Test
    public void test2() {
        assertEquals(55, solution1.countLetters("aaaaaaaaaa"));
    }
}
