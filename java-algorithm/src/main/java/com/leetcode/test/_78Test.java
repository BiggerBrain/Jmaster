package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._78;

import common.utils.CommonUtils;

public class _78Test {
    private static _78.Solution1 solution1;
    private static _78.Solution2 solution2;
    private static _78.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _78.Solution1();
        solution2 = new _78.Solution2();
        solution3 = new _78.Solution3();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.subsets(new int[] { 1, 2, 3 }));
    }

    @Test
    public void test2() {
        CommonUtils.printListList(solution2.subsets(new int[] { 1, 2, 3 }));
    }

    @Test
    public void test3() {
        CommonUtils.printListList(solution3.subsets(new int[] { 1, 2, 3 }));
    }
}
