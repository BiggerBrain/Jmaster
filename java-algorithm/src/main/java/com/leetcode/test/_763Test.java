package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._763;

public class _763Test {
    private static _763.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _763.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(9, 7, 8), solution1.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(9, 7, 8), solution1.partitionLabels("ababcbacadefegdehijhklij"));
    }
}
