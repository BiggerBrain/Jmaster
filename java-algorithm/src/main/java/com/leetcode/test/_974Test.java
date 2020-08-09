package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._974;

public class _974Test {

    private static _974.Solution1 test;

    @BeforeClass
    public static void setUp() {
        test = new _974.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, test.subarraysDivByK(new int[] { 4, 5, 0, -2, -3, 1 }, 5));
    }
}
