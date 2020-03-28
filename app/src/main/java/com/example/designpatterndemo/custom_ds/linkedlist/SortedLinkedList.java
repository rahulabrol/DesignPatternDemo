package com.example.designpatterndemo.custom_ds.linkedlist;

import androidx.annotation.NonNull;

public class SortedLinkedList {

    public static void main(String[] args) {
        // input keys
        int[] keys = {6, 3, 4, 8, 2, 9};

        // points to the head node of the linked list
        Node head = null;

        // construct linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        System.out.println("Head is: " + head);

        head = InsertSort(head);

        // print linked list
        printList(head);
    }

    private static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data + " -> ");
            ptr = ptr.next;
            System.out.println("null");
        }
    }

    private static Node InsertSort(Node head) {
        Node result = null;    // build the answer here
        Node current = head;    // iterate over the original list
        Node next;

        while (current != null) {
            // tricky - note the next reference before we change it
            next = current.next;
            System.out.println("Next is: " + next);
            result = sortedInsert(result, current);
            System.out.println("result is: " + result);
            current = next;
            System.out.println("Current is: " + current);
        }

        return result;
    }

    private static Node sortedInsert(Node head, Node newNode) {

        Node dummy = new Node();
        Node current = dummy;
        dummy.next = head;
        System.out.println("Dummy is: " + dummy);

        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        return dummy.next;
    }

    /**
     * Class used to represent the data part and the next node weather it is null if
     * we do not have the next node else we have the object reference of the node.
     *
     * @author Rahul Abrol
     */
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node() {
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @NonNull
        @Override
        public String toString() {
            return "{" +
                    " data: " + data +
                    ",next: " + next +
                    " }";
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}
