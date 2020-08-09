package com.leetcode.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._735;

public class _735Test {
    private static _735.Solution1 solution1;
    private static int[]          asteroids;

    @BeforeClass
    public static void setup() {
        solution1 = new _735.Solution1();
    }

    @Test
    public void test1() {
        asteroids = new int[] { 5, 10, -5 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] { 5, 10 }, asteroids);
    }

    @Test
    public void test2() {
        asteroids = new int[] { 8, -8 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] {}, asteroids);
    }

    @Test
    public void test3() {
        asteroids = new int[] { 10, 2, -5 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] { 10 }, asteroids);
    }

    @Test
    public void test4() {
        asteroids = new int[] { -2, 1, 2, -2 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] { -2, 1 }, asteroids);
    }

    @Test
    public void test5() {
        asteroids = new int[] { -2, -2, -2, 1 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] { -2, -2, -2, 1 }, asteroids);
    }

    @Test
    public void test6() {
        asteroids = new int[] { -2, -1, 1, 2 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] { -2, -1, 1, 2 }, asteroids);
    }

    @Test
    public void test7() {
        asteroids = new int[] { -2, -2, 1, -2 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] { -2, -2, -2 }, asteroids);
    }

    @Test
    public void test8() {
        asteroids = new int[] { -4, -1, 10, 2, -1, 8, -9, -6, 5, 2 };
        asteroids = solution1.asteroidCollision(asteroids);
        assertArrayEquals(new int[] { -4, -1, 10, 5, 2 }, asteroids);
    }

}