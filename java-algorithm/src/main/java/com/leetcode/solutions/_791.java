package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 791. Custom Sort String

 S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

 S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.

 Return any permutation of T (as a string) that satisfies this property.

 Example :
 Input:
 S = "cba"
 T = "abcd"
 Output: "cbad"
 Explanation:
 "a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
 Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.

 Note:

 S has length at most 26, and no character is repeated in S.
 T has length at most 200.
 S and T consist of lowercase letters only.

 */
public class _791 {
    public static class Solution1 {
        public String customSortString(String S, String T) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : T.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            for (char c : S.toCharArray()) {
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    while (count-- > 0) {
                        sb.append(c);
                    }
                    map.remove(c);
                }
            }
            for (char c : map.keySet()) {
                int count = map.get(c);
                while (count-- > 0) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
}
