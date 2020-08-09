package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._99;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _99Test {
    private static _99.Solution1 solution1;
    private static TreeNode      root;

    @BeforeClass
    public static void setup() {
        solution1 = new _99.Solution1();
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        TreeUtils.printBinaryTree(root);
        solution1.recoverTree(root);
        TreeUtils.printBinaryTree(root);
    }

    @Test
    public void test2() {
        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        TreeUtils.printBinaryTree(root);
        solution1.recoverTree(root);
        TreeUtils.printBinaryTree(root);
    }

}
