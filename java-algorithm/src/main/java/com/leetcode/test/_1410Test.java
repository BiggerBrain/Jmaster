package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1410;

public class _1410Test {
    private static _1410.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1410.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("& is an HTML entity but &ambassador; is not.",
            solution1.entityParser("&amp; is an HTML entity but &ambassador; is not."));
    }

}