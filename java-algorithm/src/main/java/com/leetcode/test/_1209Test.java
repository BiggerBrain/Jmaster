package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1209;

public class _1209Test {

    private static _1209.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1209.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("abcd", solution1.removeDuplicates("abcd", 2));
    }

    @Test
    public void test2() {
        assertEquals("aa", solution1.removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    public void test3() {
        assertEquals("ps", solution1.removeDuplicates("pbbcggttciiippooaais", 2));
    }

}