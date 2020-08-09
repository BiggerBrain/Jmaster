package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._228;

public class _228Test {
    private static _228.Solution1 solution1;
    private static List<String>   expected;
    private static int[]          nums;

    @BeforeClass
    public static void setup() {
        solution1 = new _228.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] { 0, 1, 2, 4, 5, 7 };
        expected = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expected, solution1.summaryRanges(nums));
    }
}
