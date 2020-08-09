package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._395;

/**
 * Created by fishercoder on 12/31/16.
 */
public class _395Test {

    private static _395.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _395.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.longestSubstring("ababbc", 2));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.longestSubstring("aaabb", 3));
    }

}