package com.leetcode.test;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1382;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _1382Test {
    private static _1382.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1382.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils
            .constructBinaryTree(Arrays.asList(1, null, 2, null, 3, null, 4, null, null));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution1.balanceBST(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils
            .constructBinaryTree(Arrays.asList(1, null, 2, null, 3, null, 4, null, 5, null, null));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution1.balanceBST(root));
    }

}