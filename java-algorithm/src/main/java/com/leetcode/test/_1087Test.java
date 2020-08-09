package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1087;

public class _1087Test {
    private static _1087.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1087.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new String[] { "ade", "adf", "bde", "bdf", "cde", "cdf" },
            solution1.expand("{a,b,c}d{e,f}"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[] { "abcd" }, solution1.expand("abcd"));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[] { "acdf", "acef", "bcdf", "bcef" },
            solution1.expand("{a,b}c{d,e}f"));
    }

}