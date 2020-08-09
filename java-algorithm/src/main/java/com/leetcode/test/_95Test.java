package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._95;

import common.utils.TreeUtils;

public class _95Test {
    private static _95.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _95.Solution1();
    }

    @Test
    public void test1() {
        solution1.generateTrees(3).forEach(TreeUtils::printBinaryTree);
    }

}
