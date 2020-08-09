package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._127;

public class _127Test {
    private static _127.Solution1 solution1;
    private static List<String>   wordList;

    @BeforeClass
    public static void setup() {
        solution1 = new _127.Solution1();
    }

    @Test
    public void test1() {
        wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));
        assertEquals(0, solution1.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void test2() {
        wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        assertEquals(5, solution1.ladderLength("hit", "cog", wordList));
    }
}
