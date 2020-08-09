package com.leetcode.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._609;

import common.utils.CommonUtils;

public class _609Test {
    private static _609.Solution1     solution1;
    private static String[]           paths;
    private static List<List<String>> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _609.Solution1();
    }

    @Test
    public void test1() {
        paths = new String[] { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
                               "root/c/d 4.txt(efgh)", "root 4.txt(efgh)" };
        actual = solution1.findDuplicate(paths);
        CommonUtils.printListList(actual);
    }
}
