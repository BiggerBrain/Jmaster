package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1189;

public class _1189Test {
    private static _1189.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1189.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.maxNumberOfBalloons("nlaebolko"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.maxNumberOfBalloons("loonbalxballpoon"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.maxNumberOfBalloons("leetcode"));
    }

}
