package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._115;

public class _115Test {
    private static _115.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _115.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numDistinct("rabbbit", "rabbit"));
    }
}
