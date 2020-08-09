package com.leetcode.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._332;

import common.utils.CommonUtils;

public class _332Test {
    private static _332.Solution1 solution1;
    private static String[][]     tickets;
    private static List<String>   expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _332.Solution1();
    }

    @Test
    public void test1() {
        tickets = new String[][] { { "MUC", "LHR" }, { "JFK", "MUC" }, { "SFO", "SJC" },
                                   { "LHR", "SFO" } };
        expected = solution1.findItinerary(tickets);
        CommonUtils.print(expected);
    }

    @Test
    public void test2() {
        tickets = new String[][] { { "JFK", "SFO" }, { "JFK", "ATL" }, { "SFO", "ATL" },
                                   { "ATL", "JFK" }, { "ATL", "SFO" } };
        expected = solution1.findItinerary(tickets);
        CommonUtils.print(expected);
    }
}
