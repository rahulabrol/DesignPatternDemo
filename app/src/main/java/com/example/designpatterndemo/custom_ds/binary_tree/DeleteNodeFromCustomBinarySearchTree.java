package com.example.designpatterndemo.custom_ds.binary_tree;

public class DeleteNodeFromCustomBinarySearchTree {

    private Node root;

    // Constructor
    DeleteNodeFromCustomBinarySearchTree(int key) {
        root = new Node(key);
    }

    // Constructor
    DeleteNodeFromCustomBinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {
        DeleteNodeFromCustomBinarySearchTree binarySearchTree = new DeleteNodeFromCustomBinarySearchTree();
        binarySearchTree.add(1);//1 3 4 6 7 8 10 13 14
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(6);
        binarySearchTree.add(7);
        binarySearchTree.add(8);
        binarySearchTree.add(10);
        binarySearchTree.add(13);
        binarySearchTree.add(15);
        binarySearchTree.add(17);

        binarySearchTree.delete(14);
    }

    /**
     * Method is used to add the node into the BST.
     *
     * @param data data of the node.
     */
    private void add(int data) {
        if (root == null) {
            //create a new node and assign it to the root.
            root = new Node(data);
            return;
        }
        //if root node is not null the add to their respective place
        insertNode(this.root, data);
    }

    private Node insertNode(Node root, int data) {
        Node tempNode;
        if (root.data >= data) {
            if (root.left == null) {
                root.left = new Node(data);
                return root.left;
            } else {
                tempNode = root.left;
            }
        } else {
            if (root.right == null) {
                root.right = new Node(data);
                return root.right;
            } else {
                tempNode = root.right;
            }
        }
        return insertNode(tempNode, data);
    }

    void delete(int data) {
        deleteNode(this.root, data);
    }

    private Node deleteNode(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            // handle all the three cases of deletion
            // node with no leaf nodes
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                // node with one node (no left node)
                return root.right;
            } else if (root.right == null) {
                // node with one node (no right node)
                return root.left;
            } else {
                //node with two nodes
                //search for min number in right sub tree
                int minValue = minValue(root.right);
                root.data = minValue;
                root.right = deleteNode(root.right, minValue);
            }

        }
        return root;
    }

    private int minValue(Node node) {
        if (node.left != null) {
            return minValue(node.left);
        }
        return node.data;
    }

    private static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = right = null;
        }

    }
}
