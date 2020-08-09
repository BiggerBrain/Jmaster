package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._783;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _783Test {
    private static _783.Solution1 solution1;
    private static TreeNode       root;

    @BeforeClass
    public static void setup() {
        solution1 = new _783.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 6, 1, 3, null, null));
        TreeUtils.printBinaryTree(root);
        assertEquals(1, solution1.minDiffInBST(root));
    }
}
