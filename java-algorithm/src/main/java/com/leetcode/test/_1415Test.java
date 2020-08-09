package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1415;

public class _1415Test {

    private static _1415.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1415.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("cab", solution1.getHappyString(3, 9));
    }

}