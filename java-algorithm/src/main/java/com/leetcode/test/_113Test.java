package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._113;

import common.classes.TreeNode;
import common.utils.TreeUtils;

public class _113Test {
    private static _113.Solution1      solution1;
    private static TreeNode            root;
    private static int                 sum;
    private static List<List<Integer>> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _113.Solution1();
    }

    @Test
    public void test1() {
        sum = 22;
        root = TreeUtils
            .constructBinaryTree(Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1));
        TreeUtils.printBinaryTree(root);
        expected = new ArrayList<>();
        expected.add(Arrays.asList(5, 4, 11, 2));
        expected.add(Arrays.asList(5, 8, 4, 5));
        assertEquals(expected, solution1.pathSum(root, sum));
    }
}
