package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1154;

public class _1154Test {
    private static _1154.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1154.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.dayOfYear("2019-01-09"));
    }

    @Test
    public void test2() {
        assertEquals(271, solution1.dayOfYear("1969-09-28"));
    }

}