package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._551;

public class _551Test {
    private static _551.Solution1 test;
    private static boolean        expected;
    private static boolean        actual;
    private static String         s;

    @BeforeClass
    public static void setup() {
        test = new _551.Solution1();
    }

    @Test
    public void test1() {
        s = "ALLAPPL";
        expected = false;
        actual = test.checkRecord(s);
        assertEquals(expected, actual);
    }
}
