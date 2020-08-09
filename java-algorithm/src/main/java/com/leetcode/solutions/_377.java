package com.leetcode.solutions;

import java.util.*;

/**
 * 377. Combination Sum IV
 *
 * Given an integer array with all positive numbers and no duplicates,
 * find the number of possible combinations that add up to a positive integer target.

 Example:

 nums = [1, 2, 3]
 target = 4

 The possible combination ways are:
 (1, 1, 1, 1)
 (1, 1, 2)
 (1, 2, 1)
 (1, 3)
 (2, 1, 1)
 (2, 2)
 (3, 1)

 Note that different sequences are counted as different combinations.

 Therefore the output is 7.

 Follow up:
 What if negative numbers are allowed in the given array?
 How does it change the problem?
 What limitation we need to add to the question to allow negative numbers?
 */

public class _377 {

    public static class Solution1 {
        /**
         * this normal backtracking recursive solution will end up in MLE by this testcase: [4,2,1], 32
         */
        public int combinationSum4(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList();
            Arrays.sort(nums);
            backtracking(nums, target, new ArrayList(), result);
            return result.size();
        }

        private void backtracking(int[] nums, int target, List<Integer> list,
                                  List<List<Integer>> result) {
            if (target == 0) {
                result.add(new ArrayList(list));
            } else if (target > 0) {
                for (int i = 0; i < nums.length; i++) {
                    list.add(nums[i]);
                    backtracking(nums, target - nums[i], list, result);
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    public static class Solution2 {
        /**
         * Since we don't need to get all of the combinations, instead,
         * we only need to get the possible count, I can use only a count instead of "List<List<Integer>> result"
         * However, it also ended up in TLE by this testcase: [1,2,3], 32
         */
        public static int count = 0;

        public int combinationSum4(int[] nums, int target) {
            Arrays.sort(nums);
            backtracking(nums, target, new ArrayList());
            return count;
        }

        private void backtracking(int[] nums, int target, List<Integer> list) {
            if (target == 0) {
                count++;
            } else if (target > 0) {
                for (int i = 0; i < nums.length; i++) {
                    list.add(nums[i]);
                    backtracking(nums, target - nums[i], list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    public static class Solution3 {
        /**
         * Time: O(n^2)
         * Space: O(n)
         *
         * Since this question doesn't require to return all the combination result, instead, it just wants one number, we could use DP
         * the idea is similar to Climbing Stairs.
         *
         * The idea is very clear as the code speaks for itself:
         * It's easy to find the routine
         * dp[0] = 0;
         * dp[1] = 1;
         * ...
         *
         * Reference: https://discuss.leetcode.com/topic/52186/my-3ms-java-dp-solution
         */
        public int combinationSum4(int[] nums, int target) {
            Arrays.sort(nums);
            int[] result = new int[target + 1];
            for (int i = 1; i < result.length; i++) {
                for (int num : nums) {
                    if (num > i) {
                        break;
                    } else if (num == i) {
                        result[i]++;
                    } else {
                        result[i] += result[i - num];
                    }
                }
            }
            return result[target];
        }
    }

    public static class Solution4 {
        /**
         * Time: O(n)
         * Space: O(n)
         *
         * Reference: https://discuss.leetcode.com/topic/52255/java-recursion-solution-using-hashmap-as-memory
         */
        public static Map<Integer, Integer> map = new HashMap<>();//need to remove public static before submitting on Leetcode as it doesn't reset static variables

        public int combinationSum4(int[] nums, int target) {
            if (nums == null || nums.length == 0 || target < 0) {
                return 0;
            }
            if (target == 0) {
                return 1;
            }
            if (map.containsKey(target)) {
                return map.get(target);
            }
            int count = 0;
            for (int num : nums) {
                count += combinationSum4(nums, target - num);
            }
            map.put(target, count);
            return count;
        }
    }
}
