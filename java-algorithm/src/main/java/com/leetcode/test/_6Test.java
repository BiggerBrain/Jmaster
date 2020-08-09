package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._6;

public class _6Test {
    private static _6.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _6.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("PAHNAPLSIIGYIR", solution1.convert("PAYPALISHIRING", 3));
    }

}