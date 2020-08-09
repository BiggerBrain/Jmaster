package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.solutions._1381;

public class _1381Test {
    private static _1381.Solution1.CustomStack customStack;

    @Test
    public void test1() {
        customStack = new _1381.Solution1.CustomStack(3);
        customStack.push(1);
        customStack.push(2);
        assertEquals(2, customStack.pop());
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100);
        customStack.increment(2, 100);
        assertEquals(103, customStack.pop());
        assertEquals(202, customStack.pop());
        assertEquals(201, customStack.pop());
        assertEquals(-1, customStack.pop());
    }

}