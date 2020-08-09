package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1339;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _1339Test {
    private static _1339.Solution1 solution1;
    private static TreeNode        root;

    @BeforeClass
    public static void setup() {
        solution1 = new _1339.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(110, solution1.maxProduct(root));
    }

}