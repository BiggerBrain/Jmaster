package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1019;

import common.classes.ListNode;
import common.utils.LinkedListUtils;

public class _1019Test {
    private static _1019.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1019.Solution1();
    }

    @Test
    public void test1() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] { 2, 1, 5 });
        assertArrayEquals(new int[] { 5, 5, 0 }, solution1.nextLargerNodes(head));
    }

    @Test
    public void test2() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] { 2, 7, 4, 3, 5 });
        assertArrayEquals(new int[] { 7, 0, 5, 5, 0 }, solution1.nextLargerNodes(head));
    }

    @Test
    public void test3() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] { 1, 7, 5, 1, 9, 2, 5, 1 });
        assertArrayEquals(new int[] { 7, 9, 9, 9, 0, 5, 0, 0 }, solution1.nextLargerNodes(head));
    }

}