package com.rahul.designpatterndemo.custom_ds.linkedlist;

public class ReverseLinkedList<T> {

    private Node<T> headElement;

    public static void main(String[] args) {
        ReverseLinkedList<Integer> linkedList = new ReverseLinkedList<>();
        int randomNo;
        System.out.print("in main()...\n");
        // Let's create integer array with 15 values in it
        for (int i = 1; i <= 5; i++) {
            randomNo = (21 + (int) (Math.random() * ((55 - 2)))); // We are just getting total 8 Random elements
            linkedList.addElement(randomNo);
        }

        System.out.println("\nOriginal Linked List:");
        linkedList.iterateElement();

        System.out.println(" ");
        linkedList.reverseElement();

        System.out.println("\nReversed Linked List:");
        linkedList.iterateElement();


    }

    /**
     * Iterate element in the node
     */
    public void iterateElement() {
        Node<T> tempVariable = headElement;
        while (tempVariable != null) {
            System.out.println(tempVariable.getNodeValue() + "  ");
            tempVariable = tempVariable.getNext();
        }
    }

    /**
     * Reverse elements in Node
     */
    public void reverseElement() {
        System.out.println("\nReversing Linked List now...\n");
        Node<T> previousElement = null;
        Node<T> currentElement = headElement;
        Node<T> nextElement = null;

        while (currentElement != null) {
            nextElement = currentElement.getNext();
            currentElement.setNext(previousElement);
            previousElement = currentElement;
            currentElement = nextElement;
        }
        headElement = previousElement;
    }

    /**
     * Add elements to Node.
     *
     * @param element element that we want to add.
     */
    public void addElement(T element) {
        Node<T> node = new Node<>(element);
        //node.setNodeValue(element);
        System.out.println("Adding Element: " + element);
        Node<T> tempVariable = headElement;
        while (true) {
            if (tempVariable == null) {
                headElement = node; // Only 1 element? Head and Tail points to the same
                break;
            } else if (tempVariable.getNext() == null) {
                tempVariable.setNext(node);
                break;
            } else {
                tempVariable = tempVariable.getNext();
            }
        }
    }

    static class Node<T> implements Comparable<T> {

        private T nodeValue;
        private Node<T> next;

        public Node(T nodeValue) {
            this.nodeValue = nodeValue;
            this.next = null;
        }

        public Node(T nodeValue, Node next) {
            this.nodeValue = nodeValue;
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getNodeValue() {
            return nodeValue;
        }

        public void setNodeValue(T nodeValue) {
            this.nodeValue = nodeValue;
        }


        // @Override indicates that a method declaration is intended
        // to override a method declaration in a supertype.
        @Override
        public int compareTo(T o) {
            if (o == this.nodeValue) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
