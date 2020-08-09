package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._804;

public class _804Test {
    private static _804.Solution1 solution1;
    private static String[]       words;

    @BeforeClass
    public static void setup() {
        solution1 = new _804.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] { "gin", "zen", "gig", "msg" };
        assertEquals(2, solution1.uniqueMorseRepresentations(words));
    }
}
