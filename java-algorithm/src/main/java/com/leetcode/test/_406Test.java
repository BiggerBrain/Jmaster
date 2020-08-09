package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._406;

import common.utils.CommonUtils;

public class _406Test {
    private static _406.Solution1 solution1;
    private static int[][]        people;
    private static int[][]        actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _406.Solution1();
    }

    @Test
    public void test1() {
        people = new int[][] { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
        actual = solution1.reconstructQueue(people);
        CommonUtils.printArrayArray(actual);
    }
}
