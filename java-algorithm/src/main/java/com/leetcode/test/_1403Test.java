package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1403;

public class _1403Test {
    private static _1403.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1403.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(10, 9), solution1.minSubsequence(new int[] { 4, 3, 10, 9, 8 }));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(7, 7, 6), solution1.minSubsequence(new int[] { 4, 4, 7, 6, 7 }));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(6), solution1.minSubsequence(new int[] { 6 }));
    }

}