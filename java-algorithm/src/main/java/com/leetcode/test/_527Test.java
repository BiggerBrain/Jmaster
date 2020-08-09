package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._527;

public class _527Test {

    private static _527.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _527.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
            Arrays.asList("l2e", "god", "internal", "me", "i6t", "interval", "inte4n", "f2e",
                "intr4n"),
            solution1.wordsAbbreviation(Arrays.asList("like", "god", "internal", "me", "internet",
                "interval", "intension", "face", "intrusion")));
    }

}
