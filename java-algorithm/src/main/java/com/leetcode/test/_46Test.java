package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._46;

import common.utils.CommonUtils;

public class _46Test {
    private static _46.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _46.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.permute(new int[] { 1, 2, 3 }));
    }
}
