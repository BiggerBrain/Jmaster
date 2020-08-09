package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._938;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _938Test {
    private static _938.Solution1 solution1;
    private static TreeNode       root;

    @BeforeClass
    public static void setup() {
        solution1 = new _938.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, 15, 3, 7, null, 18));
        TreeUtils.printBinaryTree(root);
        assertEquals(32, solution1.rangeSumBST(root, 7, 15));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, 15, 3, 7, 13, 18, 1, null, 6));
        TreeUtils.printBinaryTree(root);
        assertEquals(23, solution1.rangeSumBST(root, 6, 10));
    }
}
