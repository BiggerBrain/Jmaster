package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._922;

import common.utils.CommonUtils;

public class _922Test {
    private static _922.Solution1 solution1;
    private static int[]          A;
    private static int[]          result;

    @BeforeClass
    public static void setup() {
        solution1 = new _922.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] { 4, 2, 5, 7 };
        result = solution1.sortArrayByParityII(A);
        CommonUtils.printArray(result);
    }

    @Test
    public void test2() {
        A = new int[] { 3, 1, 4, 2 };
        result = solution1.sortArrayByParityII(A);
        CommonUtils.printArray(result);
    }
}
