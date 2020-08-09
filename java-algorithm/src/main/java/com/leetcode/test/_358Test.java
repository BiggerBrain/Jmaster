package com.leetcode.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._358;

public class _358Test {

    private static _358.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _358.Solution1();
    }

    @Test
    public void test1() {
        System.out.println(solution1.rearrangeString("aabbcc", 3));
    }

    @Test
    public void test2() {
        System.out.println(solution1.rearrangeString("aaabc", 3));
    }

    @Test
    public void test3() {
        System.out.println(solution1.rearrangeString("aaadbbcc", 2));
    }
}
