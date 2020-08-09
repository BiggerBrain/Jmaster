package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._206;

import common.classes.ListNode;
import common.utils.LinkedListUtils;

public class _206Test {
    private static _206.Solution1 solution1;
    private static _206.Solution2 solution2;
    private static ListNode       head;

    @BeforeClass
    public static void setup() {
        solution1 = new _206.Solution1();
        solution2 = new _206.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 4 });
        assertEquals(LinkedListUtils.contructLinkedList(new int[] { 4, 3, 2, 1 }),
            solution1.reverseList(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 4 });
        assertEquals(LinkedListUtils.contructLinkedList(new int[] { 4, 3, 2, 1 }),
            solution2.reverseList(head));
    }
}
