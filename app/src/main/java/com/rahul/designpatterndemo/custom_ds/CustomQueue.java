package com.rahul.designpatterndemo.custom_ds;

import java.util.LinkedList;

/**
 * Created by abrol at 14/03/25.
 * <p/>
 * Queue is a data structure which follow first in first out FIFO order.
 * <p>
 * Various operations in queue are:
 * Enqueue: Add the elements in the last position of the {@link LinkedList}
 * Dequeue: Remove the elements from the first position of the {@link LinkedList}
 * peek: Return the element which will be removed first.
 * isEmpty: Return {@link Boolean} while checking if queue is empty or not.
 * size: Return the total number of elements in the queue.
 */
public class CustomQueue<T> {
    private final LinkedList<T> queue;

    public CustomQueue() {
        queue = new LinkedList<>();
    }

    // Checks if the queue is empty by checking the length of the list.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Returns the number of items in the queue.
    public int size() {
        return queue.size();
    }

    // Adds an item to the end of the queue
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // Removes and returns the item from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return queue.removeFirst();
        }
    }

    // Returns the front item without removing it.
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return queue.getFirst();
        }
    }

    // Override toString() to print the queue
    @Override
    public String toString() {
        return queue.toString();
    }
}

class QueueSolution {
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();

        // Enqueue items
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Peek at the front item
        System.out.println("Front item: " + queue.peek());  // Should print 1

        // Dequeue items
        System.out.println("Dequeue: " + queue.dequeue());  // Should print 1
        System.out.println("Dequeue: " + queue.dequeue());  // Should print 2

        // Check the size of the queue
        System.out.println("Queue size: " + queue.size());  // Should print 1

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());  // Should print false

        // Dequeue remaining items
        System.out.println("Dequeue: " + queue.dequeue());  // Should print 3

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());  // Should print true
    }
}
