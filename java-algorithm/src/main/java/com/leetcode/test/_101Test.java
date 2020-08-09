package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._101;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _101Test {
    private static _101.Solution1 solution1;
    private static TreeNode       root;

    @BeforeClass
    public static void setup() {
        solution1 = new _101.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        assertEquals(true, solution1.isSymmetric(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, null, 3, null, 3));
        assertEquals(false, solution1.isSymmetric(root));
    }
}
