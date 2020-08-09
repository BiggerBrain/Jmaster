package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1408;

public class _1408Test {
    private static _1408.Solution1 solution1;
    private static String[]        words;
    private static List<String>    expected;
    private static List<String>    actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _1408.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] { "mass", "as", "hero", "superhero" };
        expected = Arrays.asList("as", "hero");
        actual = solution1.stringMatching(words);
        assertEquals(expected.containsAll(actual), actual.containsAll(expected));
    }

}