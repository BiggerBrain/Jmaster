package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._876;

import common.classes.ListNode;

public class _876Test {
    private static _876.Solution1 solution1;
    private static ListNode       head;
    private static ListNode       middle;

    @BeforeClass
    public static void setup() {
        solution1 = new _876.Solution1();
    }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        middle = solution1.middleNode(head);
        assertEquals(middle, ListNode.createSinglyLinkedList(Arrays.asList(3, 4, 5)));
    }

    @Test
    public void test2() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        middle = solution1.middleNode(head);
        assertEquals(middle, ListNode.createSinglyLinkedList(Arrays.asList(4, 5, 6)));
    }
}
