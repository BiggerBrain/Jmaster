package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._402;

public class _402Test {
    private static _402.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _402.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("1219", solution1.removeKdigits("1432219", 3));
    }
}
