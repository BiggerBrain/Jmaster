package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._700;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _700Test {
    private static _700.Solution1 solution1;
    private static TreeNode       root;
    private static TreeNode       expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _700.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        assertEquals(expected, solution1.searchBST(root, 2));
    }
}
