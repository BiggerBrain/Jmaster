package com.leetcode.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._82;

import common.classes.ListNode;
import common.utils.LinkedListUtils;

public class _82Test {

    private static _82.Solution1 solution1;
    private static ListNode      head;
    private static ListNode      expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _82.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 3, 3, 4, 4, 5 });
        expected = LinkedListUtils.contructLinkedList(new int[] { 1, 2, 5 });
        Assert.assertEquals(expected, solution1.deleteDuplicates(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[] { 1, 1, 1, 2, 3 });
        expected = LinkedListUtils.contructLinkedList(new int[] { 2, 3 });
        Assert.assertEquals(expected, solution1.deleteDuplicates(head));
    }
}