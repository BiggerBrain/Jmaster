package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.leetcode.solutions._1025;

@Ignore
public class _1025Test {
    private static _1025.Solution1 solution1;

    @Before
    public void setup() {
        solution1 = new _1025.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.divisorGame(2));
    }
}
