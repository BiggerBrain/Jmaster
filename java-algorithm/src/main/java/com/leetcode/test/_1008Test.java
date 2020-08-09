package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.solutions._1008;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _1008Test {
    private static _1008.Solution1 solution1;
    private static int[]           preorder;
    private static TreeNode        expected;
    private static TreeNode        actual;

    @Test
    public void test1() {
        solution1 = new _1008.Solution1();
        preorder = new int[] { 8, 5, 1, 7, 10, 12 };
        expected = TreeUtils.constructBinaryTree(Arrays.asList(8, 5, 10, 1, 7, null, 12));
        TreeUtils.printBinaryTree(expected);
        actual = solution1.bstFromPreorder(preorder);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }

}