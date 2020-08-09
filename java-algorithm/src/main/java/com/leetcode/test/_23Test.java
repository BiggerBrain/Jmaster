package com.leetcode.test;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._23;

import common.classes.ListNode;
import common.utils.CommonUtils;

public class _23Test {
    private static _23.Solution1 solution1;
    private static ListNode[]    lists;

    @BeforeClass
    public static void setup() {
        solution1 = new _23.Solution1();
    }

    @Test
    public void test1() {
        ListNode head1 = ListNode.createSinglyLinkedList(Arrays.asList(1, 3, 5, 7, 11));
        ListNode head2 = ListNode.createSinglyLinkedList(Arrays.asList(2, 8, 12));
        ListNode head3 = ListNode.createSinglyLinkedList(Arrays.asList(4, 6, 9, 10));
        lists = new ListNode[] { head1, head2, head3 };
        CommonUtils.printList(solution1.mergeKLists(lists));
    }

}