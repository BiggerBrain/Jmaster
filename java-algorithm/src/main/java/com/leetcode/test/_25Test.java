package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._25;

import common.classes.ListNode;
import common.utils.LinkedListUtils;

public class _25Test {
    private static _25      test;
    private static ListNode actual;
    private static ListNode expected;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        test = new _25();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 4, 5 });
        actual = test.reverseKGroup(head, 2);
        expected = LinkedListUtils.contructLinkedList(new int[] { 2, 1, 4, 3, 5 });
        assertEquals(actual, expected);
    }

}