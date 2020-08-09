package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._921;

public class _921Test {
    private static _921.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _921.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minAddToMakeValid("())"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.minAddToMakeValid("((("));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.minAddToMakeValid("()"));
    }

    @Test
    public void test4() {
        assertEquals(4, solution1.minAddToMakeValid("()))(("));
    }

}