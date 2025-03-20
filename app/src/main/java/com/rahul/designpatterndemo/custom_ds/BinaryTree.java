package com.rahul.designpatterndemo.custom_ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by abrol at 16/03/25.
 * <p>
 * A tree is a hierarchical data structure that consists of nodes connected by edges. It is widely
 * used in computer science to represent relationships, such as organizational structures, file
 * systems, or decision-making processes.
 * <p>
 * Key Characteristics of a Tree:
 * Root: The topmost node in the tree. There is only one root in a tree.
 * Node: Each element in the tree is called a node. A node can contain data and references to other nodes (children).
 * Edge: The connection between two nodes. If node A points to node B, then the edge connects A and B.
 * Parent-Child Relationship: A parent node is one that has edges to other nodes (children). A node with no children is called a leaf node.
 * Subtree: A tree consisting of a node and its descendants.
 * Depth: The level of a node in the tree (distance from the root).
 * Height: The maximum depth of the tree.
 * <p>
 * Example of a Tree:
 * Consider a simple tree that represents a family structure:
 * <p>
 * # Example Tree:
 * #        A (Root)
 * #       / \
 * #     B     C
 * #    / \     \
 * #   D   E     F
 * <p>
 * ooHere:
 * <p>
 * A is the root.
 * B and C are children of A.
 * D and E are children of B, and F is a child of C.
 * D, E, and F are leaf nodes (no children).
 * <p>
 * Types of Trees:
 * Binary Tree: A tree where each node has at most two children.
 * Binary Search Tree (BST): A binary tree where for every node, the left child is smaller, and the right child is larger than the node’s value.
 * Balanced Tree: A tree where the left and right subtrees of every node differ in height by at most one.
 * AVL Tree: A self-balancing binary search tree.
 * Heap: A binary tree where every parent node is either greater or smaller than its children (max-heap or min-heap).
 * <p>
 * Tree Traversal:
 * Traversal refers to the process of visiting all the nodes in a tree.
 * There are different methods of traversing a tree:
 * <p>
 * Preorder Traversal: Visit the root, traverse the left subtree, and then the right subtree.
 * Inorder Traversal: Traverse the left subtree, visit the root, and then the right subtree.
 * Postorder Traversal: Traverse the left subtree, traverse the right subtree, and then visit the root.
 * Level Order Traversal: Visit nodes level by level, starting from the root.
 */
class Node {
    char data;
    Node left;
    Node right;

    public Node(char data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    public static void main(String[] args) {
        // Create an example tree
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.right = new Node('F');

        BinaryTree tree = new BinaryTree();
        // Perform Level Order Traversal
        System.out.println("Level Order Traversal:");
        tree.levelOrderTraversal(root);

        System.out.println("Reverse Level Order Traversal:");
        tree.reverseLevelOrder(root);

        System.out.println();

        char target = 'C';
//        char target = 'P';
        System.out.println("In Recursive, Is " + target + " present in BST? " + tree.searchInBST(root, target));
        System.out.println("In Iterative, Is " + target + " present in BST? " + tree.searchInBSTIterative(root, target));



    }

    private void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        // Create a queue to hold nodes to be processed
        Queue<Node> queue = new LinkedList<>();

        // Start with the root node
        queue.offer(root);


        while (!queue.isEmpty()) {
            // Dequeue the front node
            Node currentNode = queue.poll();

            System.out.println(currentNode.data + " ");

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
    }

    private void reverseLevelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            stack.push(current);

            if (current.right != null) queue.offer(current.right);
            if (current.left != null) queue.offer(current.left);
        }

        // Print nodes from stack (bottom to top)
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }

    private Boolean searchInBST(Node root, char target) {
        if (root == null) return false; // If tree is empty then return false
        if (root.data == target)
            return true; // If the root has data which matched with target then we found the item return true.

        // Search in left or right subtree
        return (target < root.data) ? searchInBST(root.left, target) : searchInBST(root.right, target);
    }

    private Boolean searchInBSTIterative(Node root, char target) {
        if (root == null) return false; // If tree is empty then return false
        while (root != null) {
            if (root.data == target) return  true;
            if (target < root.data) root = root.left;
            else root = root.right;
        }
        return false;
    }
}
