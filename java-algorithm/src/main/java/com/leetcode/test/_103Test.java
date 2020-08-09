package com.leetcode.test;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._103;

import common.classes.TreeNode;
import common.utils.CommonUtils;
import common.utils.TreeUtils;

public class _103Test {
    private static _103.Solution1 solution1;
    private static TreeNode       root;

    @BeforeClass
    public static void setup() {
        solution1 = new _103.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printListList(solution1.zigzagLevelOrder(root));
    }

}