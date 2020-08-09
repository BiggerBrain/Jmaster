package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 138. Copy List with Random Pointer
 *
 * A linked list is given such that each node contains an additional random
 * pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 */

public class _138 {
    public static class Solution1 {
        public Node copyRandomList(Node head) {
            /**Key is the original nodes, value is the new nodes we're deep copying to.*/
            Map<Node, Node> map = new HashMap();
            Node node = head;

            //loop for the first time: copy the node themselves with only labels
            while (node != null) {
                map.put(node, new Node(node.val));
                node = node.next;
            }

            //loop for the second time: copy random and next pointers
            node = head;
            while (node != null) {
                map.get(node).next = map.get(node.next);
                map.get(node).random = map.get(node.random);
                node = node.next;
            }

            return map.get(head);
        }

        // Definition for singly-linked list with a random pointer.
        class Node {
            int  val;

            Node next;
            Node random;

            Node(int x) {
                this.val = x;
            }
        }
    }
}
