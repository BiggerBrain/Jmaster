package com.leetcode.solutions;

import java.util.*;

/**
 * 716. Max Stack
 *
 * Design a max stack that supports push, pop, top, peekMax and popMax.
 *
 push(x) -- Push element x onto stack.
 pop() -- Remove the element on top of the stack and return it.
 top() -- Get the element on the top.
 peekMax() -- Retrieve the maximum element in the stack.
 popMax() -- Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.

 Example 1:
 MaxStack stack = new MaxStack();
 stack.push(5);
 stack.push(1);
 stack.push(5);
 stack.top(); -> 5
 stack.popMax(); -> 5
 stack.top(); -> 1
 stack.peekMax(); -> 5
 stack.pop(); -> 1
 stack.top(); -> 5
 Note:
 -1e7 <= x <= 1e7
 Number of operations won't exceed 10000.
 The last four operations won't be called when stack is empty.
 */
public class _716 {
    public static class Solution1 {
        /**This is O(n) for popMax() and pop() while O(1) for the other three operations which is UN-acceptable during an interview!
         * We need to do better than O(n) time complexity in order to ace the interview!
         * But O(1) is impossible, so let's aim for O(logn).*/
        public static class MaxStack {

            private final Stack<Integer> stack;
            private int                  max;

            /**
             * initialize your data structure here.
             */
            public MaxStack() {
                max = Integer.MIN_VALUE;
                stack = new Stack<>();
            }

            public void push(int x) {
                if (x > max) {
                    max = x;
                }
                stack.push(x);
            }

            public int pop() {
                if (stack.peek() == max) {
                    int result = stack.pop();
                    max = findMax();
                    return result;
                } else {
                    return stack.pop();
                }
            }

            private int findMax() {
                if (!stack.isEmpty()) {
                    Iterator<Integer> iterator = stack.iterator();
                    int max = stack.peek();
                    while (iterator.hasNext()) {
                        max = Math.max(max, iterator.next());
                    }
                    return max;
                } else {
                    max = Integer.MIN_VALUE;
                    return max;
                }
            }

            public int top() {
                return stack.peek();
            }

            public int peekMax() {
                return max;
            }

            public int popMax() {
                Stack<Integer> tmp = new Stack<>();
                int result = 0;
                while (!stack.isEmpty()) {
                    if (stack.peek() != max) {
                        tmp.push(stack.pop());
                    } else {
                        result = stack.pop();
                        break;
                    }
                }
                while (!tmp.isEmpty()) {
                    stack.push(tmp.pop());
                }
                max = findMax();
                return result;
            }
        }
    }

    public static class Solution2 {
        /** Use a treemap and a doubly linked list to achieve O(logn) time complexity. */

        static class Node {
            int  val;
            Node prev;
            Node next;

            public Node(int val) {
                this.val = val;
            }
        }

        static class DoublyLinkedList {
            Node head;
            Node tail;

            public DoublyLinkedList() {
                head = new Node(0);
                tail = new Node(0);
                head.next = tail;
                tail.prev = head;
            }

            public Node add(int val) {
                /**For this doubly linked list, we always add it to the end of the list*/
                Node x = new Node(val);
                x.next = tail;
                x.prev = tail.prev;
                tail.prev.next = x;
                tail.prev = tail.prev.next;
                return x;
            }

            public int pop() {
                /**for pop(), we always pop one from the tail of the doubly linked list*/
                return unlink(tail.prev).val;
            }

            public Node unlink(Node node) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                return node;
            }

            public int peek() {
                return tail.prev.val;
            }
        }

        public static class MaxStack {
            TreeMap<Integer, List<Node>> treeMap;
            /**
             * the reason we have a list of nodes as treemap's value is because one value could be pushed
             * multiple times into this MaxStack and we want to keep track of all of them.
             */
            DoublyLinkedList             doublyLinkedList;

            /** initialize your data structure here. */
            public MaxStack() {
                treeMap = new TreeMap();
                doublyLinkedList = new DoublyLinkedList();
            }

            public void push(int x) {
                Node node = doublyLinkedList.add(x);
                if (!treeMap.containsKey(x)) {
                    treeMap.put(x, new ArrayList<>());
                }
                treeMap.get(x).add(node);
            }

            public int pop() {
                int val = doublyLinkedList.pop();
                List<Node> nodes = treeMap.get(val);
                nodes.remove(nodes.size() - 1);
                if (nodes.isEmpty()) {
                    treeMap.remove(val);
                }
                return val;
            }

            public int top() {
                return doublyLinkedList.peek();
            }

            public int peekMax() {
                return treeMap.lastKey();
            }

            public int popMax() {
                int max = treeMap.lastKey();
                List<Node> nodes = treeMap.get(max);
                Node node = nodes.remove(nodes.size() - 1);
                doublyLinkedList.unlink(node);
                if (nodes.isEmpty()) {
                    treeMap.remove(max);
                }
                return max;
            }
        }
    }
}
