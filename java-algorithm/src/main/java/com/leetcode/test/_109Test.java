package com.leetcode.test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._109;

import common.classes.ListNode;
import common.classes.TreeNode;
import common.utils.LinkedListUtils;
import common.utils.TreeUtils;

public class _109Test {
    private static _109.Solution1 solution1;
    private static ListNode       head;
    private static TreeNode       expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _109.Solution1();
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 4, 5 });
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, 4, null, 2, null, 5));
        /**as long as it's a height-balanced tree, it's good for this problem requirement*/
        TreeUtils.printBinaryTree(solution1.sortedListToBST(head));
    }

}