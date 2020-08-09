package com.leetcode.solutions;

import java.util.*;

public class _249 {

    public static class Solution1 {
        public List<List<String>> groupStrings(String[] strings) {

            List<List<String>> result = new ArrayList<List<String>>();
            Map<String, List<String>> map = new HashMap<String, List<String>>();

            for (String word : strings) {
                String key = "";
                int offset = word.charAt(0) - 'a';
                for (int i = 1; i < word.length(); i++) {
                    key += (word.charAt(i) - offset + 26) % 26;
                }

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(word);
            }

            for (List<String> list : map.values()) {
                Collections.sort(list);
                result.add(list);
            }

            return result;
        }
    }

}
