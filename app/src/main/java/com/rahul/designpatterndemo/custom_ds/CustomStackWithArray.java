package com.rahul.designpatterndemo.custom_ds;

/**
 * Created by abrol at 14/03/25.
 */
public class CustomStackWithArray {
    private final int[] stack;
    private final int capacity;
    private int top;

    public CustomStackWithArray(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed to stack.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println("Popped element: " + stack[top] + " from stack.");
            top--;
        }
    }

    public void peek() {
        System.out.println("Top element: " + stack[top]);
    }

    // Method to display the stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

// This is a dynamic stack
class CustomStackWithLinkedList {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // point new node to the current top
        top = newNode; // update top to new node
        System.out.println(value + " pushed to stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else  {
            int poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }
    }

    // Method to peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;  // Return a special value indicating stack is empty
        } else {
            return top.data;  // Return the value of the top element
        }
    }

    // Method to display the stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node current = top;
            System.out.print("Stack elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

class StackSolution {
    public static void main(String[] args) {
        System.out.println("********************* Stack implementation with LinkedList ******************");
        CustomStackWithLinkedList stackWithLinkedList = new CustomStackWithLinkedList();
        // Push elements onto the stack
        stackWithLinkedList.push(10);
        stackWithLinkedList.push(20);
        stackWithLinkedList.push(30);
        stackWithLinkedList.push(40);

        // Display the stack contents
        stackWithLinkedList.display();

        // Pop an element from the stack
        System.out.println(stackWithLinkedList.pop() + " popped from stack.");

        // Peek at the top element
        System.out.println("Top element is: " + stackWithLinkedList.peek());

        // Display the stack after popping
        stackWithLinkedList.display();

        System.out.println();
        System.out.println();
        System.out.println("********************* Stack implementation with Array ******************");
        System.out.println();
        System.out.println();
        CustomStackWithArray stack = new CustomStackWithArray(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();

        stack.peek();
    }
}