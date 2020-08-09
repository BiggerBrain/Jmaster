package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1038;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _1038Test {
    private static _1038.Solution1 solution1;
    private static TreeNode        root;
    private static TreeNode        expected;
    private static TreeNode        actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _1038.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(
            Arrays.asList(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8));
        TreeUtils.printBinaryTree(root);
        expected = TreeUtils.constructBinaryTree(
            Arrays.asList(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8));
        TreeUtils.printBinaryTree(expected);
        actual = solution1.bstToGst(root);
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }

}