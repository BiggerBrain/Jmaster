package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._712;

public class _712Test {
    private static _712.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _712.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(231, solution1.minimumDeleteSum("sea", "eat"));
    }

    @Test
    public void test2() {
        assertEquals(403, solution1.minimumDeleteSum("delete", "leet"));
    }

}
