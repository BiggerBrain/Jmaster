package com.leetcode.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._47;

import common.utils.CommonUtils;

public class _47Test {
    private static _47.Solution1       solution1;
    private static List<List<Integer>> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _47.Solution1();
    }

    @Test
    public void test1() {
        actual = solution1.permuteUnique(new int[] { 1, 1, 2 });
        CommonUtils.printListList(actual);
    }

}
