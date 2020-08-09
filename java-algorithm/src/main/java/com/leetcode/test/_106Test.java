package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._106;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _106Test {
    private static _106.Solution1 solution1;
    private static TreeNode       expected;
    private static TreeNode       actual;
    private static int[]          inorder;
    private static int[]          postorder;

    @BeforeClass
    public static void setup() {
        solution1 = new _106.Solution1();
    }

    @Test
    public void test1() {
        /**it should be a tree like this:
         *    3
         *   /
         *  1
         *   \
         *   2
         */
        postorder = new int[] { 2, 1, 3 };
        inorder = new int[] { 1, 2, 3 };
        actual = solution1.buildTree(inorder, postorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, null, null, 2));
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        /**it should be a tree like this:
         *    3
         *   /
         *  1
         *   \
         *   5
         *  /
         * 2
         *  \
         *  4
         */
        postorder = new int[] { 4, 2, 5, 1, 3 };
        inorder = new int[] { 1, 2, 4, 5, 3 };
        actual = solution1.buildTree(inorder, postorder);
        expected = TreeUtils
            .constructBinaryTree(Arrays.asList(3, 1, null, null, 5, 2, null, null, 4));
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        /**it should be a tree like this:
         *    2
         *   /
         *  1
         */
        inorder = new int[] { 1, 2 };
        postorder = new int[] { 1, 2 };
        actual = solution1.buildTree(inorder, postorder);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 1));
        assertEquals(expected, actual);
    }
}
