package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._203;

import common.classes.ListNode;
import common.utils.LinkedListUtils;

public class _203Test {
    private static _203.Solution1 solution1;
    private static ListNode       head;
    private static ListNode       expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _203.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 6, 3, 4, 5, 6 });
        expected = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 4, 5 });
        assertEquals(expected, solution1.removeElements(head, 6));
    }

}