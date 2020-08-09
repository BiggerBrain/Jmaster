package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._110;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _110Test {
    private static _110.Solution1 solution1;
    private static _110.Solution2 solution2;
    private static TreeNode       treeNode;

    @BeforeClass
    public static void setup() {
        solution1 = new _110.Solution1();
        solution2 = new _110.Solution2();
    }

    @Test
    public void test1() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertEquals(true, solution1.isBalanced(treeNode));
    }

    @Test
    public void test2() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertEquals(true, solution2.isBalanced(treeNode));
    }

    @Test
    public void test3() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 3, null, null, 4, 4));
        assertEquals(false, solution1.isBalanced(treeNode));
    }

    @Test
    public void test4() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 3, null, null, 4, 4));
        assertEquals(false, solution2.isBalanced(treeNode));
    }

}