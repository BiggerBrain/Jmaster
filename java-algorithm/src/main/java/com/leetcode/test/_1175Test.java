package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.leetcode.solutions._1175;

@Ignore
public class _1175Test {
    private static _1175.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1175.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(12, solution1.numPrimeArrangements(5));
    }

}