package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1161;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _1161Test {
    private static _1161.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1161.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 7, 0, 7, -8, null, null));
        assertEquals(2, solution1.maxLevelSum(root));
    }
}
