package com.leetcode.test;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._237;

import common.classes.ListNode;
import common.utils.CommonUtils;

public class _237Test {
    private static _237.Solution1 solution1;
    private static ListNode       head;

    @BeforeClass
    public static void setup() {
        solution1 = new _237.Solution1();
    }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(4, 5, 1, 9));
        CommonUtils.printList(head);
        solution1.deleteNode(head.next);
        CommonUtils.printList(head);
    }

}