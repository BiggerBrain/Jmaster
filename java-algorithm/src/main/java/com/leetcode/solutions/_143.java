package com.leetcode.solutions;

import common.classes.ListNode;

/**
 * 143. Reorder List
 *
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 You must do this in-place without altering the nodes' values.

 For example,
 Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
public class _143 {
    public static class Solution1 {
        public void reorderList(ListNode head) {
            if (head == null || head.next == null) {
                return;
            }
            /* first we use two pointers to separate this list into two parts */
            ListNode slowNode = head;
            ListNode fastNode = head;
            while (fastNode.next != null) {
                fastNode = fastNode.next;
                if (fastNode.next != null) {
                    fastNode = fastNode.next;
                } else {
                    break;
                }
                slowNode = slowNode.next;
            }
            // two sublist heads
            ListNode head1 = head;
            ListNode head2 = slowNode.next;
            // detach the two sublists;
            slowNode.next = null;

            // reverse the second sublist
            ListNode cur = head2;
            ListNode post = cur.next;
            cur.next = null;
            while (post != null) {
                ListNode temp = post.next;
                post.next = cur;
                cur = post;
                post = temp;
            }
            head2 = cur;// the new head of the reversed sublist

            // merge the two sublists as required
            ListNode p = head1;
            ListNode q = head2;
            while (q != null) {
                ListNode temp1 = p.next;
                ListNode temp2 = q.next;
                p.next = q;
                q.next = temp1;
                p = temp1;
                q = temp2;
            }
        }
    }
}
