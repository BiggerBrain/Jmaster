package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1302;

import common.utils.TreeUtils;

public class _1302Test {
    private static _1302.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1302.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(15, solution1.deepestLeavesSum(TreeUtils.constructBinaryTree(
            Arrays.asList(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8))));
    }

}