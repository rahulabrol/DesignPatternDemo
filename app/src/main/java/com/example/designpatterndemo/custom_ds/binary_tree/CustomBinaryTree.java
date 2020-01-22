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
        CustomBinaryTree bst = new CustomBinaryTree();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);

        //create root node
//        binaryTree.root = new Node(1);
//         /* following is the tree after above statement
//
//              1
//            /   \
//          null  null     */
//        binaryTree.root.left = new Node(2);
//        binaryTree.root.right = new Node(3);
//          /* 2 and 3 become left and right children of 1
//               1
//             /   \
//            2      3
//          /    \    /  \
//        null null null null  */
//
//        binaryTree.root.left.left = new Node(4);
//        /* 4 becomes left child of 2
//                    1
//                /       \
//               2          3
//             /   \       /  \
//            4    null  null  null
//           /   \
//          null null
//         */

    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            System.out.println(" -> inserted: " + data);
            return;
        }

        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private Node insertNode(Node root, int data) {
        Node tempNode;
        //if root.key is greater than key then enter in left side
        if (root.key >= data) {
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
