package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._663;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _663Test {
    private static _663.Solution1 solution1;
    private static TreeNode       root;
    private static boolean        expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _663.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5, 10, 10, null, null, 2, 3));
        TreeUtils.printBinaryTree(root);
        expected = true;
        assertEquals(expected, solution1.checkEqualTree(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 10, null, null, 2, 20));
        TreeUtils.printBinaryTree(root);
        expected = false;
        assertEquals(expected, solution1.checkEqualTree(root));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2, 2));
        TreeUtils.printBinaryTree(root);
        expected = false;
        assertEquals(expected, solution1.checkEqualTree(root));
    }

    @Test
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(0));
        TreeUtils.printBinaryTree(root);
        expected = false;
        assertEquals(expected, solution1.checkEqualTree(root));
    }

}
