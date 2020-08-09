package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.leetcode.solutions._1367;

import common.classes.ListNode;
import common.classes.TreeNode;
import common.utils.LinkedListUtils;
import common.utils.TreeUtils;

public class _1367Test {
    private static _1367.Solution1 solution1;

    @Test
    public void test1() {
        solution1 = new _1367.Solution1();
        ListNode head = LinkedListUtils.contructLinkedList(new int[] { 4, 2, 8 });
        TreeNode root = TreeUtils.constructBinaryTree(
            Arrays.asList(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3));
        assertEquals(true, solution1.isSubPath(head, root));
    }

    @Test
    public void test2() {
        solution1 = new _1367.Solution1();
        ListNode head = LinkedListUtils.contructLinkedList(new int[] { 1, 4, 2, 6 });
        TreeNode root = TreeUtils.constructBinaryTree(
            Arrays.asList(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3));
        assertEquals(true, solution1.isSubPath(head, root));
    }

    @Test
    public void test3() {
        solution1 = new _1367.Solution1();
        ListNode head = LinkedListUtils.contructLinkedList(new int[] { 1, 4, 2, 6, 8 });
        TreeNode root = TreeUtils.constructBinaryTree(
            Arrays.asList(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3));
        assertEquals(false, solution1.isSubPath(head, root));
    }

}