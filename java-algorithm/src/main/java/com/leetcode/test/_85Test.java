package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._85;

public class _85Test {
    private static _85.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _85.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6,
            (solution1.maximalRectangle(
                new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' },
                               { '1', '1', '1', '1', '1' }, { '1', '0', '0', '1', '0' } })));
    }

}
