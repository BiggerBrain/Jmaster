package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._67;

public class _67Test {
    private static _67.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _67.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("100", solution1.addBinary("11", "1"));
    }
}
