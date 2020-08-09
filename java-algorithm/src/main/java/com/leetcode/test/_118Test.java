package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._118;

import common.utils.CommonUtils;

public class _118Test {
    private static _118.Solution1 solution1;
    private static _118.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _118.Solution1();
        solution2 = new _118.Solution2();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.generate(5));
    }

    @Test
    public void test2() {
        CommonUtils.printListList(solution2.generate(5));
    }

}
