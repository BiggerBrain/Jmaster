package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.solutions._979;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _979Test {
    private static _979.Solution1 solution1;
    private static TreeNode       root;

    @Test
    public void test1() {
        solution1 = new _979.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 0, 0));
        assertEquals(2, solution1.distributeCoins(root));
    }

    @Test
    public void test2() {
        solution1 = new _979.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(0, 3, 0));
        assertEquals(3, solution1.distributeCoins(root));
    }

    @Test
    public void test3() {
        solution1 = new _979.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 2));
        assertEquals(2, solution1.distributeCoins(root));
    }

    @Test
    public void test4() {
        solution1 = new _979.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 0, null, 3));
        assertEquals(4, solution1.distributeCoins(root));
    }
}
