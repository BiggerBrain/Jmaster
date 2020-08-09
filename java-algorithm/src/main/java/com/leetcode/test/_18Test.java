package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._18;

import common.utils.CommonUtils;

public class _18Test {
    private static _18.Solution1 solution1;
    private static int[]         nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _18.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 1, 0, -1, 0, -2, 2 };
        CommonUtils.printListList(solution1.fourSum(nums, 0));
    }

}