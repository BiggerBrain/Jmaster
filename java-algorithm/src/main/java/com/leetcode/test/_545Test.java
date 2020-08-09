package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._545;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _545Test {
    private static _545.Solution1 test;
    private static TreeNode       root;
    private static List<Integer>  expected;

    @BeforeClass
    public static void setup() {
        test = new _545.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4, 5, null, 6, 7));
        TreeUtils.printBinaryTree(root);
        expected = Arrays.asList(1, 2, 4, 6, 7, 5, 3);
        assertEquals(expected, test.boundaryOfBinaryTree(root));
    }

}
