package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1271;

public class _1271Test {
    private static _1271.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1271.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("IOI", solution1.toHexspeak("257"));
    }

    @Test
    public void test2() {
        assertEquals("ERROR", solution1.toHexspeak("3"));
    }

    @Test
    public void test3() {
        assertEquals("ERROR", solution1.toHexspeak("619879596177"));
    }

    @Test
    public void test4() {
        assertEquals("AEIDBCDIBC", solution1.toHexspeak("747823223228"));
    }

}
