package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._933;

public class _933Test {
    private static _933.Solution1.RecentCounter solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _933.Solution1.RecentCounter();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.ping(1));
    }

}
