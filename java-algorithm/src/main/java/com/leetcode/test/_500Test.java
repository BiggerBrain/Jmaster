package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._500;

/**
 * Created by fishercoder on 1/15/17.
 */
public class _500Test {
    private static _500     test;
    private static String[] expected;
    private static String[] actual;
    private String[]        words;

    @BeforeClass
    public static void setup() {
        test = new _500();
    }

    @Test
    public void test1() {
        words = new String[] { "Alaska", "Hello", "Dad", "Peace" };
        expected = new String[] { "Alaska", "Dad" };
        actual = test.findWords(words);
        assertArrayEquals(expected, actual);
    }
}
