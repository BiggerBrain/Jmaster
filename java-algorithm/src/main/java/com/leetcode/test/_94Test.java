package com.leetcode.test;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._94;

import common.classes.TreeNode;
import common.utils.CommonUtils;
import common.utils.TreeUtils;

public class _94Test {
    private static _94.Solution1 solution1;
    private static _94.Solution2 solution2;
    private static TreeNode      root;
    private static List<Integer> inorder;

    @BeforeClass
    public static void setup() {
        solution1 = new _94.Solution1();
        solution2 = new _94.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, null, null, 5, 2, null, null, 4));
        inorder = solution1.inorderTraversal(root);
        CommonUtils.printList(inorder);
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(
            Arrays.asList(1, 2, 3, 4, null, 5, 6, null, 7, null, null, null, null, 8, 9));
        TreeUtils.printBinaryTree(root);
        inorder = solution1.inorderTraversal(root);
        CommonUtils.printList(inorder);
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, null, null, 6));
        TreeUtils.printBinaryTree(root);
        inorder = solution2.inorderTraversal(root);
        CommonUtils.printList(inorder);
    }

}
