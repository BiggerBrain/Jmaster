package com.leetcode.test;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._107;

import common.classes.TreeNode;
import common.utils.CommonUtils;
import common.utils.TreeUtils;

public class _107Test {
    private static _107.Solution1 solution1;
    private static TreeNode       root;

    @BeforeClass
    public static void setup() {
        solution1 = new _107.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printListList(solution1.levelOrder(root));
    }

}