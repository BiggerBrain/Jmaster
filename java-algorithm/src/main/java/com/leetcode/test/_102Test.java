package com.leetcode.test;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._102;

import common.classes.TreeNode;
import common.utils.CommonUtils;
import common.utils.TreeUtils;

public class _102Test {
    private static _102.Solution1 solution1;
    private static TreeNode       treeRoot;

    @BeforeClass
    public static void setup() {
        solution1 = new _102.Solution1();
    }

    @Test
    public void test1() {
        treeRoot = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(treeRoot);
        CommonUtils.printListList(solution1.levelOrder(treeRoot));
    }

    @Test
    public void test2() {
        treeRoot = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        TreeUtils.printBinaryTree(treeRoot);
        CommonUtils.printListList(solution1.levelOrder(treeRoot));
    }

}