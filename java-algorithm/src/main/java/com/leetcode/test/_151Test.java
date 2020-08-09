package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._151;

public class _151Test {
    private static _151.Solution1 solution1;
    private static String         s;

    @BeforeClass
    public static void setup() {
        solution1 = new _151.Solution1();
    }

    @Test
    public void test1() {
        s = " ";
        assertEquals("", solution1.reverseWords(s));
    }

    @Test
    public void test2() {
        s = " 1";
        assertEquals("1", solution1.reverseWords(s));
    }

    @Test
    public void test3() {
        s = "   a   b ";
        assertEquals("b a", solution1.reverseWords(s));
    }

    @Test
    public void test4() {
        s = "a b  c";
        assertEquals("c b a", solution1.reverseWords(s));
    }
}
