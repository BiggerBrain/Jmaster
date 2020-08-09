package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1281;

public class _1281Test {
    private static _1281.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1281.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(15, solution1.subtractProductAndSum(234));
    }

}