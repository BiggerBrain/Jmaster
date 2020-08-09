package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._800;

public class _800Test {
    private static _800.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _800.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("#11ee66", solution1.similarRGB("#09f166"));
    }
}
