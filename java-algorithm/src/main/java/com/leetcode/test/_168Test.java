package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._168;

public class _168Test {
    private static _168.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _168.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("APSM", solution1.convertToTitle(28899));
    }
}
