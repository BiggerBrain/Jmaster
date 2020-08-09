package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._77;

import common.utils.CommonUtils;

public class _77Test {
    private static _77.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _77.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.combine(4, 2));
    }
}
