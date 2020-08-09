package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._59;

import common.utils.CommonUtils;

public class _59Test {
    private static _59.Solution1 solution1;
    private static int[][]       matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _59.Solution1();
    }

    @Test
    public void test1() {
        matrix = solution1.generateMatrix(6);
        CommonUtils.print2DIntArray(matrix);
    }
}
