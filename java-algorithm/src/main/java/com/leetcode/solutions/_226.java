package com.leetcode.solutions;

import java.util.LinkedList;
import java.util.Queue;

import common.classes.TreeNode;

/**
 * 226. Invert Binary Tree

  Invert a binary tree.

		 4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9

	to

		 4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1

Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew),
 but you can�t invert a binary tree on a whiteboard so fuck off.
 */
public class _226 {

    public static class Solution1 {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return root;
            }
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while (!q.isEmpty()) {
                TreeNode curr = q.poll();
                TreeNode temp = curr.left;
                curr.left = curr.right;
                curr.right = temp;
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            return root;
        }
    }

    public static class Solution2 {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return root;
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }

    public static class Solution3 {
        //more concise version
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return root;
            }
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
        }
    }
}
