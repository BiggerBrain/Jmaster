package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._104;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _104Test {
    private static _104.Solution1 solution1;
    private static _104.Solution2 solution2;
    private static TreeNode       root;

    @BeforeClass
    public static void setup() {
        solution1 = new _104.Solution1();
        solution2 = new _104.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertEquals(3, solution1.maxDepth(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        TreeUtils.printBinaryTree(root);
        assertEquals(3, solution2.maxDepth(root));
    }
}
