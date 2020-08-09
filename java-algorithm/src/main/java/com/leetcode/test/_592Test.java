package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._592;

/**
 * Created by fishercoder on 5/23/17.
 */
public class _592Test {
    private static _592.Solution1 test;
    private static String         expression;

    @BeforeClass
    public static void setup() {
        test = new _592.Solution1();
    }

    @Test
    public void test1() {
        expression = "-1/2+1/2+1/3";
        assertEquals("1/3", test.fractionAddition(expression));
    }
}
