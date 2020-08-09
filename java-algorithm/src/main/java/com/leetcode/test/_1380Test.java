package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1380;

public class _1380Test {
    private static _1380.Solution1 solution1;
    private static int[][]         matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _1380.Solution1();
    }

    @Test
    public void test1() {
        matrix = new int[][] { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        assertEquals(Arrays.asList(15), solution1.luckyNumbers(matrix));
    }

}