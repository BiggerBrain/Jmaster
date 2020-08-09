package com.leetcode.test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.solutions._897;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _897Test {
    private static _897.Solution1 solution1;
    private static TreeNode       root;
    private static TreeNode       actual;

    @Before
    public void setup() {
        solution1 = new _897.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils
            .constructBinaryTree(Arrays.asList(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9));
        TreeUtils.printBinaryTree(root);
        actual = solution1.increasingBST(root);
        TreeUtils.printBinaryTree(actual);
    }
}
