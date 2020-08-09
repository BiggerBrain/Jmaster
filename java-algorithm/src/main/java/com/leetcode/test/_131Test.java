package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._131;

public class _131Test {
    private static _131.Solution1     solution1;
    private static List<List<String>> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _131.Solution1();
    }

    @Test
    public void test1() {
        expected = new ArrayList();
        expected.add(Arrays.asList("a", "a", "b"));
        expected.add(Arrays.asList("aa", "b"));
        assertEquals(expected, solution1.partition("aab"));
    }
}
