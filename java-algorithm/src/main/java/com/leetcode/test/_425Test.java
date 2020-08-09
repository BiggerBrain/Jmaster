package com.leetcode.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._425;

import common.utils.CommonUtils;

public class _425Test {
    private static _425.Solution1 solution1;
    private static String[]       words;

    @BeforeClass
    public static void setup() {
        solution1 = new _425.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] { "area", "lead", "wall", "lady", "ball" };
        List<List<String>> result = solution1.wordSquares(words);
        CommonUtils.printListList(result);
    }
}
