package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._993;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _993Test {
    private static _993.Solution1 solution1;
    private static TreeNode       root;

    @BeforeClass
    public static void setUp() {
        solution1 = new _993.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4));
        TreeUtils.printBinaryTree(root);
        assertEquals(false, solution1.isCousins(root, 4, 3));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4, null, 5));
        TreeUtils.printBinaryTree(root);
        assertEquals(true, solution1.isCousins(root, 5, 4));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4));
        TreeUtils.printBinaryTree(root);
        assertEquals(false, solution1.isCousins(root, 2, 3));
    }
}
