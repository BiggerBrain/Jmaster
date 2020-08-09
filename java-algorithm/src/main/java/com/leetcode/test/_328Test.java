package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._328;

import common.classes.ListNode;

public class _328Test {
    private static _328.Solution1 solution1;
    private static ListNode       expected;
    private static ListNode       node;

    @BeforeClass
    public static void setup() {
        solution1 = new _328.Solution1();
    }

    @Test
    public void test1() {
        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        expected = new ListNode(1);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(5);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(4);
        assertEquals(expected, solution1.oddEvenList(node));
    }
}
