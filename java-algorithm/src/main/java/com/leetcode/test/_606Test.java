package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._606;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _606Test {
    private static _606.Solution1 solution1;
    private static _606.Solution2 solution2;
    private static TreeNode       treeNode;

    @BeforeClass
    public static void setup() {
        solution1 = new _606.Solution1();
        solution2 = new _606.Solution2();
    }

    @Test
    public void test1() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4));
        assertEquals("1(2(4))(3)", solution1.tree2str(treeNode));
        assertEquals("1(2(4))(3)", solution2.tree2str(treeNode));
    }

    @Test
    public void test2() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4));
        assertEquals("1(2()(4))(3)", solution1.tree2str(treeNode));
        assertEquals("1(2()(4))(3)", solution2.tree2str(treeNode));
    }

    @Test
    public void test3() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2, null, 3));
        assertEquals("1()(2()(3))", solution1.tree2str(treeNode));
        assertEquals("1()(2()(3))", solution2.tree2str(treeNode));
    }
}
