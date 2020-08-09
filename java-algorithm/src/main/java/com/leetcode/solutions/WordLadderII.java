package com.leetcode.solutions;

import java.util.*;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find all shortest transformation sequence(s) from beginWord to endWord, such that:
 * <p>
 * Only one letter can be changed at a time
 * Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 * Note:
 * <p>
 * Return an empty list if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * You may assume no duplicates in the word list.
 * You may assume beginWord and endWord are non-empty and are not the same.
 * Example 1:
 * <p>
 * Input:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * <p>
 * Output:
 * [
 * ["hit","hot","dot","dog","cog"],
 * ["hit","hot","lot","log","cog"]
 * ]
 */
public class WordLadderII {


    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dict = new HashSet<>(wordList);
        List<List<String>> result = new ArrayList<>();
        //Neighbors for every node
        HashMap<String, ArrayList<String>> nodeNeighbors = new HashMap<>();
        HashMap<String, Integer> distance = new HashMap<>();
        ArrayList<String> solution = new ArrayList<>();
        dict.add(beginWord);
        bfs(beginWord, endWord, dict, nodeNeighbors, distance);
        dfs(beginWord, endWord, dict, nodeNeighbors, distance, solution, result);
        return result;
    }

    /**
     * bfs
     *
     * @param start
     * @param end
     * @param dict
     * @param nodeNeighbors
     * @param distance
     */
    private void bfs(String start, String end, Set<String> dict,
                     HashMap<String, ArrayList<String>> nodeNeighbors,
                     HashMap<String, Integer> distance) {
        for (String str : dict) {
            nodeNeighbors.put(str, new ArrayList<String>());
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        distance.put(start, 0);
        while (!queue.isEmpty()) {
            int count = queue.size();
            boolean foundEnd = false;
            for (int i = 0; i < count; i++) {
                String cur = queue.poll();
                int curDistance = distance.get(cur);
                ArrayList<String> neighbors = getNeighbors(cur, dict);
                for (String neighbor : neighbors) {
                    nodeNeighbors.get(cur).add(neighbor);
                    //check if visited
                    if (!distance.containsKey(neighbor)) {
                        distance.put(neighbor, curDistance + 1);
                        if (end.equals(neighbor)) {
                            foundEnd = true;
                        } else {
                            queue.offer(neighbor);
                        }
                    }
                }
                if (foundEnd) {
                    break;
                }
            }
        }
    }

    private void dfs(String cur, String end, Set<String> dict,
                     HashMap<String, ArrayList<String>> nodeNeighbors,
                     HashMap<String, Integer> distance, ArrayList<String> solution,
                     List<List<String>> res) {
        solution.add(cur);
        if (end.equals(cur)) {
            res.add(new ArrayList<>(solution));
        } else {
            for (String next : nodeNeighbors.get(cur)) {
                if (distance.get(next) == distance.get(cur) + 1) {
                    dfs(next, end, dict, nodeNeighbors, distance, solution, res);
                }
            }
        }
        solution.remove(solution.size() - 1);
    }

    /**
     * @param node
     * @param dict
     * @return
     */
    private ArrayList<String> getNeighbors(String node, Set<String> dict) {
        ArrayList<String> res = new ArrayList<>();
        char[] chs = node.toCharArray();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < chs.length; i++) {
                if (chs[i] == ch)
                    continue;
                char old_ch = chs[i];
                chs[i] = ch;
                if (dict.contains(String.valueOf(chs))) {
                    res.add(String.valueOf(chs));
                }
                chs[i] = old_ch;
            }
        }
        return res;
    }
}