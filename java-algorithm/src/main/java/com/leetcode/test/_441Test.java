package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._441;

public class _441Test {
    private static _441.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _441.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.arrangeCoins(3));
    }

}