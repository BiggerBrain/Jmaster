package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._942;

import common.utils.CommonUtils;

public class _942Test {
    private static _942.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _942.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.diStringMatch("IDID"));
    }

    @Test
    public void test2() {
        CommonUtils.printArray(solution1.diStringMatch("III"));
    }

    @Test
    public void test3() {
        CommonUtils.printArray(solution1.diStringMatch("DDI"));
    }
}
