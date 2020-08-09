package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 767. Reorganize String
 *
 * Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.

 If possible, output any possible result.  If not possible, return the empty string.

 Example 1:

 Input: S = "aab"
 Output: "aba"

 Example 2:

 Input: S = "aaab"
 Output: ""

 Note:

 S will consist of lowercase letters and have length in range [1, 500].
 */

public class _767 {
    public static class Solution1 {
        public String reorganizeString(String S) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : S.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int len = S.length();
            for (char c : map.keySet()) {
                if ((len % 2 == 0 && map.get(c) > len / 2)
                    || (len % 2 != 0 && map.get(c) >= len / 2 + 2)) {
                    return "";
                }
            }
            PriorityQueue<CustChar> queue = new PriorityQueue<>((a, b) -> b.count - a.count);
            for (char c : map.keySet()) {
                queue.offer(new CustChar(c, map.get(c)));
            }

            StringBuilder sb = new StringBuilder();
            while (!queue.isEmpty()) {
                CustChar curr = queue.poll();
                char c = curr.c;
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != c) {
                    sb.append(c);
                    if (curr.count > 1) {
                        queue.offer(new CustChar(c, curr.count - 1));
                    }
                } else if (sb.length() == 0) {
                    sb.append(c);
                    if (curr.count > 1) {
                        queue.offer(new CustChar(c, curr.count - 1));
                    }
                } else if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c && !queue.isEmpty()) {
                    CustChar next = queue.poll();
                    sb.append(next.c);
                    if (next.count > 1) {
                        queue.offer(new CustChar(next.c, next.count - 1));
                    }
                    queue.offer(curr);
                }
            }
            return sb.toString();
        }

        class CustChar {
            Character c;
            int       count;

            public CustChar(Character c, int count) {
                this.c = c;
                this.count = count;
            }
        }
    }
}
