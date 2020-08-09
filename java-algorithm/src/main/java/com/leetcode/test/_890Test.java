package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._890;

public class _890Test {
    private static _890.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _890.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("mee", "aqq"), solution1.findAndReplacePattern(
            new String[] { "abc", "deq", "mee", "aqq", "dkd", "ccc" }, "abb"));
    }
}
