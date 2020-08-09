package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._316;

public class _316Test {
    private static _316.Solution1 solution1;
    private static _316.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _316.Solution1();
        solution2 = new _316.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("abc", solution1.removeDuplicateLetters("bcabc"));
        assertEquals("abc", solution2.removeDuplicateLetters("bcabc"));
    }

    @Test
    public void test2() {
        assertEquals("acdb", solution1.removeDuplicateLetters("cbacdcbc"));
        assertEquals("acdb", solution2.removeDuplicateLetters("cbacdcbc"));
    }
}
