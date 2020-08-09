package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._725;

import common.classes.ListNode;
import common.utils.LinkedListUtils;

public class _725Test {
    private static _725.Solution1 solution1;
    private static _725.Solution2 solution2;
    private static ListNode       root;
    private static int            k;
    private static ListNode[]     actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _725.Solution1();
        solution2 = new _725.Solution2();
    }

    @Test
    public void test1() {
        root = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3 });
        k = 5;
        actual = solution1.splitListToParts(root, k);
        for (ListNode head : actual) {
            ListNode.printList(head);
        }
    }

    @Test
    public void test2() {
        root = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        k = 3;
        actual = solution1.splitListToParts(root, k);
        for (ListNode head : actual) {
            ListNode.printList(head);
        }
    }

    @Test
    public void test3() {
        root = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3 });
        k = 5;
        actual = solution2.splitListToParts(root, k);
        for (ListNode head : actual) {
            ListNode.printList(head);
        }
    }

    @Test
    public void test4() {
        root = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        k = 3;
        actual = solution2.splitListToParts(root, k);
        for (ListNode head : actual) {
            ListNode.printList(head);
        }
    }

}