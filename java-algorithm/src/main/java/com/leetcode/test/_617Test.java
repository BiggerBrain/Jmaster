package com.leetcode.test;

import static junit.framework.TestCase.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._617;

import common.utils.TreeUtils;

public class _617Test {
    private static _617.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _617.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 5, 4, null, 7)),
            solution1.mergeTrees(TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5)),
                TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3, null, 4, null, 7))));
    }

}
