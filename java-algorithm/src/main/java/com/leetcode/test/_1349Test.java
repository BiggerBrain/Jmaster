package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._1349;

public class _1349Test {
    private static _1349.Solution1 solution1;
    private static char[][]        seats;

    @BeforeClass
    public static void setup() {
        solution1 = new _1349.Solution1();
    }

    @Test
    public void test1() {
        seats = new char[][] { { '#', '.', '#', '#', '.', '#' }, { '.', '#', '#', '#', '#', '.' },
                               { '#', '.', '#', '#', '.', '#' } };
        assertEquals(4, solution1.maxStudents(seats));
    }

}