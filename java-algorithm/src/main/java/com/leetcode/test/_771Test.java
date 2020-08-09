package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._771;

public class _771Test {
    private static _771.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _771.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numJewelsInStones("aA", "aAAbbbb"));
    }
}
