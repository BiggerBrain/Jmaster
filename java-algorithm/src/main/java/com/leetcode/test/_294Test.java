package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._294;

public class _294Test {
    private static _294.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _294.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.canWin("++++"));
    }
}
