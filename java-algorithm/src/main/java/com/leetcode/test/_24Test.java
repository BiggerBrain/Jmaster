package com.leetcode.test;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._24;

import common.classes.ListNode;
import common.utils.CommonUtils;

public class _24Test {
    private static _24.Solution1 solution1;
    private static ListNode      head;

    @BeforeClass
    public static void setup() {
        solution1 = new _24.Solution1();
    }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4));
        CommonUtils.printList(solution1.swapPairs(head));
    }

}