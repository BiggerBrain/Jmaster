package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._230;

import common.classes.TreeNode;

/**
 * Created by fishercoder on 5/19/17.
 */
public class _230Test {
    private static _230.Solution1 solution1;
    private static _230.Solution2 solution2;
    private static TreeNode       root;
    private static int            k;

    @BeforeClass
    public static void setup() {
        solution1 = new _230.Solution1();
        solution2 = new _230.Solution2();
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        k = 1;
        assertEquals(1, solution1.kthSmallest(root, k));
        assertEquals(1, solution2.kthSmallest(root, k));
    }

    @Test
    public void test2() {
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        k = 1;
        assertEquals(1, solution1.kthSmallest(root, k));
        assertEquals(1, solution2.kthSmallest(root, k));
    }
}
