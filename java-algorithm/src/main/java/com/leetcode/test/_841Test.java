package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._841;

public class _841Test {
    private static _841.Solution1      solution1;
    private static List<List<Integer>> rooms;

    @BeforeClass
    public static void setup() {
        solution1 = new _841.Solution1();
    }

    @Test
    public void test1() {
        rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList());
        assertEquals(true, solution1.canVisitAllRooms(rooms));
    }

    @Test
    public void test2() {
        rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(0));
        assertEquals(false, solution1.canVisitAllRooms(rooms));
    }
}
