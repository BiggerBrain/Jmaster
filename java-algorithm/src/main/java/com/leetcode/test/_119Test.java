package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._119;

public class _119Test {
    private static _119.Solution1 solution1;
    private static _119.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _119.Solution1();
        solution2 = new _119.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 3, 3, 1), solution1.getRow(3));
        assertEquals(Arrays.asList(1, 3, 3, 1), solution2.getRow(3));
    }

}