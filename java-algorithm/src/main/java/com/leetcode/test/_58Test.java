package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._58;

public class _58Test {
    private static _58.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _58.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.lengthOfLastWord("Hello World"));
    }
}
