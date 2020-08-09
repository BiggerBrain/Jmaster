package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1022;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _1022Test {
    private static _1022.Solution1 solution1;
    private static TreeNode        root;

    @BeforeClass
    public static void setup() {
        solution1 = new _1022.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 1, 0, 1, 0, 1));
        TreeUtils.printBinaryTree(root);
        assertEquals(22, solution1.sumRootToLeaf(root));
    }

}