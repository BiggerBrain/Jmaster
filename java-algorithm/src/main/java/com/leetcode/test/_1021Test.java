package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1021;

public class _1021Test {
    private static _1021.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1021.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("()()()", solution1.removeOuterParentheses("(()())(())"));
    }

    @Test
    public void test2() {
        assertEquals("()()()()(())", solution1.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    public void test3() {
        assertEquals("", solution1.removeOuterParentheses("()()"));
    }

}