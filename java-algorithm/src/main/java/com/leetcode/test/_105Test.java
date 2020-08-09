package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._105;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _105Test {
    private static _105.Solution1 solution1;
    private static TreeNode       expected;
    private static TreeNode       actual;
    private static int[]          preorder;
    private static int[]          inorder;

    @BeforeClass
    public static void setup() {
        solution1 = new _105.Solution1();
    }

    @Test
    public void test1() {
        preorder = new int[] { 1, 2, 3 };
        inorder = new int[] { 2, 1, 3 };
        actual = solution1.buildTree(preorder, inorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        preorder = new int[] { 1, 2, 4, 5, 3 };
        inorder = new int[] { 4, 2, 5, 1, 3 };
        actual = solution1.buildTree(preorder, inorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, actual);
    }
}
