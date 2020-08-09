package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1047;

public class _1047Test {
    private static _1047.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1047.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("ca", solution1.removeDuplicates("abbaca"));
    }

}