package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._22;

import common.utils.CommonUtils;

public class _22Test {
    private static _22.Solution1 solution1;
    private static _22.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _22.Solution1();
        solution2 = new _22.Solution2();
    }

    @Test
    public void test1() {
        CommonUtils.printList(solution1.generateParenthesis(3));
    }

    @Test
    public void test2() {
        CommonUtils.printList(solution2.generateParenthesis(3));
    }

}