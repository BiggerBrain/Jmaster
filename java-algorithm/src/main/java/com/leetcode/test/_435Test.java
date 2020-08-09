package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._435;

import common.classes.Interval;

public class _435Test {
    private static _435.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _435.Solution1();
    }

    @Test
    public void test1() {
        Interval interval1 = new Interval(1, 100);
        Interval interval2 = new Interval(11, 22);
        Interval interval3 = new Interval(1, 11);
        Interval interval4 = new Interval(2, 12);
        Interval[] intervals = new Interval[] { interval1, interval2, interval3, interval4 };
        assertEquals(2, solution1.eraseOverlapIntervals(intervals));
    }

}