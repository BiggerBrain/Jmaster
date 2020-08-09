package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.solutions._362;

public class _362Test {
    private static _362.Solution1.HitCounter hitCounter;

    @BeforeClass
    public static void setup() {
        hitCounter = new _362.Solution1.HitCounter();
    }

    @Test
    public void test1() {
        hitCounter.hit(1);
        hitCounter.hit(2);
        hitCounter.hit(3);
        assertEquals(3, hitCounter.getHits(4));

        hitCounter.hit(300);
        assertEquals(4, hitCounter.getHits(300));
        assertEquals(3, hitCounter.getHits(301));

        hitCounter.hit(301);
        assertEquals(4, hitCounter.getHits(300));
    }

}