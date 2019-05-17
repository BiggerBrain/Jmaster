package chapter11.three.four;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 三叉链表存储的思想是让每个节点都能“记住”它的左右两个子节点以及其父节点
 */
class Node<T> {
    T data;
    Node left;
    Node right;
}

public class ThreeLinkBinTree<E> {
    private TreeNode root;

    // 以默认的构造器创建二叉树
    public ThreeLinkBinTree() {
        this.root = new TreeNode();
    }

    // 以指定根元素创建二叉树
    public ThreeLinkBinTree(E data) {
        this.root = new TreeNode(data);
    }

    public TreeNode addNode(TreeNode parent, E data, Boolean isLeft) {
        if (parent == null) {
            throw new RuntimeException(parent + "节点null，无法添加子节点");
        }
        if (isLeft && parent.left != null) {
            throw new RuntimeException(parent + "节点已有左子节点，无法添加左子节点");
        }
        if (!isLeft && parent.right != null) {
            throw new RuntimeException(parent + "节点已有右子节点，无法添加右子节点");
        }
        TreeNode newNode = new TreeNode(data);
        if (isLeft) {
            // 让父节点的left引用指向新节点
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        // 让新节点的parent引用到parent节点
        newNode.parent = parent;
        return newNode;
    }

    // 判断二叉树是否为空
    public boolean empty() {
        // 根据根元素判断二叉树是否为空
        return root.data == null;
    }

    // 返回根节点
    public TreeNode root() {
        if (empty()) {
            throw new RuntimeException("树为空，无法访问根节点");
        }
        return root;
    }

    // 返回指定节点（非根节点）的父节点
    public E parent(TreeNode node) {
        if (node == null) {
            throw new RuntimeException("节点为null，无法访问其父节点");
        }
        return (E) node.parent.data;
    }

    // 返回指定节点（非叶子）的左子节点，当左子节点不存在时返回null
    public E leftChild(TreeNode parent) {
        if (parent == null) {
            throw new RuntimeException(parent + "节点为null，无法添加子节点");
        }
        return parent.left == null ? null : (E) parent.left.data;
    }

    // 返回指定节点（非叶子）的右子节点，当右子节点不存在时返回null
    public E rightChild(TreeNode parent) {
        if (parent == null) {
            throw new RuntimeException(parent + "节点为null，无法添加子节点");
        }
        return parent.right == null ? null : (E) parent.right.data;
    }

    // 返回该二叉树的深度
    public int deep() {
        return deep(root);
    }

    // 这是一个递归方法：每颗子树的深度为其所有子树的最大深度+ 1
    public int deep(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // 没有子树
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            int leftDeep = deep(node.left);
            int rightDeep = deep(node.right);
            // 记录其所有左、右子树中较大的深度
            int max = leftDeep > rightDeep ? leftDeep : rightDeep;
            // 返回其左右子树中较大的深度 + 1
            return max + 1;
        }
    }

    // 广度优先遍历
    public List<TreeNode> breadthFirst() {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<TreeNode> list = new ArrayList<>();
        if (root != null) {
            // 将根元素加入“队列”
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            // 将该队列的“队尾”的元素添加到List中
            list.add(queue.peek());
            TreeNode p = queue.poll();
            // 如果左子节点不为null，将它加入“队列”
            if (p.left != null) {
                queue.offer(p.left);
            }
            // 如果右子节点不为null，将它加入“队列”
            if (p.right != null) {
                queue.offer(p.right);
            }
        }
        return list;
    }

    public static class TreeNode {
        Object data;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode() {
        }

        public TreeNode(Object data) {
            this.data = data;
        }

        public TreeNode(Object data, TreeNode left, TreeNode right, TreeNode parent) {
            this.data = data;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }
}
