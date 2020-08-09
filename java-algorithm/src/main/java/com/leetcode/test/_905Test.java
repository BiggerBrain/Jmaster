package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._905;

import common.utils.CommonUtils;

public class _905Test {
    private static _905.Solution1 solution1;
    private static int[]          A;
    private static int[]          actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _905.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] { 3, 1, 2, 4 };
        actual = solution1.sortArrayByParity(A);
        CommonUtils.printArray(actual);
    }

    @Test
    public void test2() {
        A = new int[] { 1, 3 };
        actual = solution1.sortArrayByParity(A);
        CommonUtils.printArray(actual);
    }
}
