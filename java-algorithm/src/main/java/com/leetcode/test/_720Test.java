package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._720;

public class _720Test {
    private static _720.Solution1 solution1;
    private static String[]       words;

    @BeforeClass
    public static void setup() {
        solution1 = new _720.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] { "w", "wo", "wor", "worl", "world" };
        assertEquals("world", solution1.longestWord(words));
    }

    @Test
    public void test2() {
        words = new String[] { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        assertEquals("apple", solution1.longestWord(words));
    }

}
