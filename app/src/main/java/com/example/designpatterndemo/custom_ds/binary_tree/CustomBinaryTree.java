package com.example.designpatterndemo.custom_ds.binary_tree;

public class CustomBinaryTree {

    private Node root;

    // Constructor
    CustomBinaryTree(int key) {
        root = new Node(key);
    }

    // Constructor
    CustomBinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        CustomBinaryTree binaryTree = new CustomBinaryTree();
        //create root node
        binaryTree.root = new Node(1);
         /* following is the tree after above statement

              1
            /   \
          null  null     */
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
          /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */

        binaryTree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

    }


    /**
     * Class containing left and right child of current
     * node and key value.
     */
    static class Node {
        int key;
        Node right;
        Node left;

        Node(int key) {
            this.key = key;
            this.left = right = null;
        }
    }
}
