package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._79;

public class _79Test {
    private static _79.Solution1 solution1;
    private static _79.Solution2 solution2;
    private static char[][]      board;

    @BeforeClass
    public static void setup() {
        solution1 = new _79.Solution1();
        solution2 = new _79.Solution2();
    }

    @Test
    public void test1() {
        board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'E', 'S' },
                               { 'A', 'D', 'E', 'E' }, };
        assertEquals(true, solution1.exist(board, "ABCEFSADEESE"));
        assertEquals(true, solution2.exist(board, "ABCEFSADEESE"));
    }

    @Test
    public void test2() {
        board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' },
                               { 'A', 'D', 'E', 'E' }, };
        assertEquals(true, solution1.exist(board, "ABCCED"));
        assertEquals(true, solution2.exist(board, "ABCCED"));

        assertEquals(true, solution1.exist(board, "SEE"));
        assertEquals(true, solution2.exist(board, "SEE"));

        assertEquals(false, solution1.exist(board, "ABCD"));
        assertEquals(false, solution2.exist(board, "ABCD"));
    }

    @Test
    public void test3() {
        board = new char[][] { { 'a' }, { 'a' }, };
        assertEquals(false, solution1.exist(board, "aaa"));
        assertEquals(false, solution2.exist(board, "aaa"));
    }

}
