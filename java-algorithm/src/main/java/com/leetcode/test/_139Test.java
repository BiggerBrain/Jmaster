package com.leetcode.test;

import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._139;

public class _139Test {
    private static _139.Solution1 solution1;
    private static _139.Solution2 solution2;
    private static _139.Solution3 solution3;
    private static String         s;
    private static List<String>   wordDict;

    @BeforeClass
    public static void setup() {
        solution1 = new _139.Solution1();
        solution2 = new _139.Solution2();
        solution3 = new _139.Solution3();
    }

    @Test
    public void test1() {
        s = "leetcode";
        wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        assertEquals(true, solution1.wordBreak(s, wordDict));
        assertEquals(true, solution2.wordBreak(s, wordDict));
        assertEquals(true, solution3.wordBreak(s, wordDict));
    }
}
