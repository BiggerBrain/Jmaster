package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1030;

import common.utils.CommonUtils;

public class _1030Test {
    private static _1030.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1030.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.print2DIntArray(solution1.allCellsDistOrder(1, 2, 0, 0));
    }

    @Test
    public void test2() {
        CommonUtils.print2DIntArray(solution1.allCellsDistOrder(2, 2, 0, 1));
    }

    @Test
    public void test3() {
        CommonUtils.print2DIntArray(solution1.allCellsDistOrder(2, 3, 1, 2));
    }

}