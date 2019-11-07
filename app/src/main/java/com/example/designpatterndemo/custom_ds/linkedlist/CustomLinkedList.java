package com.example.designpatterndemo.custom_ds.linkedlist;

import org.jetbrains.annotations.NotNull;

public class CustomLinkedList {

    private static int counter;
    // reference to the head Node.
    private Node head;
    // LinkedList constructor
    public CustomLinkedList() {
        // this is an empty list,so the reference to the head node
        // is set to a new node with no data.
    }

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("1");
        customLinkedList.add("3");
        customLinkedList.add("5");
        customLinkedList.add("7");
        customLinkedList.add("2");
        customLinkedList.add("4");
        customLinkedList.add("6");
        customLinkedList.add("8");
        System.out.println(customLinkedList.toString());
    }

    private static void incrementCounter() {
        counter++;
    }

    private static int getCounter() {
        return counter;
    }

    /**
     * Method is used to append the specified element to the end of this list.
     *
     * @param data the element that we need to add.
     */
    public void add(Object data) {

        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node(data);
        }

        Node temp = new Node(data);
        Node current = head;
        // Let's check for NPE before iterate over current
        if (current != null) {

            // starting to the head node crawl to the end of the list.
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // the last node's "next" reference set to our new node
            current.setNext(temp);
        }

        // increment the number of elements variable.
        incrementCounter();
    }

    private void decrementCounter() {
        counter--;
    }

    /**
     * Insert the specified element in the specified position in the list.
     *
     * @param data  data part
     * @param index index of the data
     */
    public void add(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;
        // Let's check for NPE before iterate over current
        if (current != null) {
            // crawl to the requested index or the last element in the list, whichever comes
            // first
            for (int i = 0; i < index && current.getNext() != null; i++) {
                current = current.getNext();
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        temp.setNext(current.getNext());

        // now set this node's next-node reference to the new node
        current.setNext(temp);

        // increment the number of elements variable
        incrementCounter();
    }

    /**
     * Return the element at the specified position of the list.
     *
     * @param index position of the list
     * @return value of the list at specified index else null
     */
    public Object get(int index) {
        // index must be 1 or higher
        if (index < 0) {
            return null;
        }

        Node current = null;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return null;

                current = current.getNext();
            }
            return current.getData();
        }
        return current;
    }

    /**
     * removes the element at the specified position in this list.
     */
    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return false;

                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());

            // decrement the number of elements variable
            decrementCounter();
            return true;

        }
        return false;
    }

    public int size() {
        return getCounter();
    }

    @NotNull
    public String toString() {
        StringBuilder output = new StringBuilder();

        if (head != null) {
            Node current = head.getNext();
            while (current != null) {
                output.append("[").append(current.getData().toString()).append("]");
                current = current.getNext();
            }
        }
        return output.toString();
    }

    /**
     * Class used to represent the data part and the next node weather it is null if
     * we do not have the next node else we have the object reference of the node.
     *
     * @author Rahul Abrol
     */
    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
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

