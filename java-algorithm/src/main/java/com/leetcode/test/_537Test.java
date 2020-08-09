package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._537;

/**
 * Created by fishercoder on 1/25/17.
 */
public class _537Test {
    private static _537.Solution1 solution1;
    private static _537.Solution2 solution2;
    private static String         expected;
    private static String         a;
    private static String         b;

    @BeforeClass
    public static void setup() {
        solution1 = new _537.Solution1();
        solution2 = new _537.Solution2();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        expected = "0+2i";
        a = "1+1i";
        b = "1+1i";
        assertEquals(expected, solution1.complexNumberMultiply(a, b));
        assertEquals(expected, solution2.complexNumberMultiply(a, b));
    }

    @Test
    public void test2() {
        expected = "0+-2i";
        a = "1+-1i";
        b = "1+-1i";
        assertEquals(expected, solution2.complexNumberMultiply(a, b));
    }
}
