package com.leetcode.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._83;

import common.classes.ListNode;

/**
 * Created by fishercoder on 4/18/17.
 */
public class _83Test {

    private static _83.Solution1 solution1;
    private static _83.Solution2 solution2;
    private static ListNode      head;
    private static ListNode      expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _83.Solution1();
        solution2 = new _83.Solution2();
    }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 1, 2, 3, 3));
        expected = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3));
        Assert.assertEquals(expected, solution1.deleteDuplicates(head));
    }

    @Test
    public void test2() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 1, 2, 3, 3));
        expected = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3));
        Assert.assertEquals(expected, solution2.deleteDuplicates(head));
    }
}
