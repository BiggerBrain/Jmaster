package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._71;

public class _71Test {
    private static _71.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _71.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("/home", solution1.simplifyPath("/home/"));
    }

    @Test
    public void test2() {
        assertEquals("/c", solution1.simplifyPath("/a/./b/../../c/"));
    }
}
