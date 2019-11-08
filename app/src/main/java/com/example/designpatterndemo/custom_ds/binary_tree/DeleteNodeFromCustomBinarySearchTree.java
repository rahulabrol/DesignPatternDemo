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
        DeleteNodeFromCustomBinarySearchTree bst = new DeleteNodeFromCustomBinarySearchTree();

        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("-------------------");
        System.out.println("In Order Traversal");
        bst.inOrderTraversal();
        System.out.println();
        bst.delete(13);
        bst.inOrderTraversal();
        System.out.println();
        bst.delete(14);
        bst.inOrderTraversal();
    }

    private void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(Node root) {

        if (root == null) return;
        doInOrder(root.left);
        System.out.print(root.data + " ");
        doInOrder(root.right);
    }


    /**
     * Method is used to add the node into the BST.
     *
     * @param data data of the node.
     */
    private void insert(int data) {
        System.out.print("[input: " + data + "]");
        if (root == null) {
            //create a new node and assign it to the root.
            root = new Node(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        //if root node is not null the add to their respective place
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private Node insertNode(Node root, int data) {
        Node tempNode;
        if (root.data >= data) {
            System.out.print(" [L]");
            if (root.left == null) {
                root.left = new Node(data);
                return root.left;
            } else {
                tempNode = root.left;
            }
        } else {
            System.out.print(" [R]");
            if (root.right == null) {
                root.right = new Node(data);
                return root.right;
            } else {
                tempNode = root.right;
            }
        }
        return insertNode(tempNode, data);
    }

    private void delete(int data) {
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
                System.out.println("deleting " + data);
                return null;
            } else if (root.left == null) {
                System.out.println("deleting " + data);
                // node with one node (no left node)
                return root.right;
            } else if (root.right == null) {
                System.out.println("deleting " + data);
                // node with one node (no right node)
                return root.left;
            } else {
                //node with two nodes
                //search for min number in right sub tree
                int minValue = minValue(root.right);
                root.data = minValue;
                root.right = deleteNode(root.right, minValue);
                System.out.println("deleting " + data);
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
