package com.leetcode.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._352;

import common.classes.Interval;
import common.utils.CommonUtils;

public class _352Test {
    private static _352.Solution1.SummaryRanges test;
    private static List<Interval>               actual;

    @BeforeClass
    public static void setup() {
        test = new _352.Solution1.SummaryRanges();
    }

    @Test
    public void test1() {
        test.addNum(1);
        actual = test.getIntervals();
        CommonUtils.printIntervals(actual);

        test.addNum(3);
        actual = test.getIntervals();
        CommonUtils.printIntervals(actual);

        test.addNum(7);
        actual = test.getIntervals();
        CommonUtils.printIntervals(actual);

        test.addNum(2);
        actual = test.getIntervals();
        CommonUtils.printIntervals(actual);

        test.addNum(6);
        actual = test.getIntervals();
        CommonUtils.printIntervals(actual);
    }
}
