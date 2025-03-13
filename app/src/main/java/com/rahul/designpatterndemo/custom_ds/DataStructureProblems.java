package com.rahul.designpatterndemo.custom_ds;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abrol at 12/03/25.
 */
public class DataStructureProblems {

    public static void main(String[] args) {
        // int arr[] = {0,0,1,1,1,2,2,3,3,4};
        // System.out.println(removeDuplicates(arr));

        // int arr[] = {0, 1, 0, 3, 12};
        // int[] modifiedArr = moveZeros(arr);
        // for(int i = 0; i < modifiedArr.length; i++) {
        //   System.out.println(modifiedArr[i]);
        // }

        // int arr[] = {12, 35, 1, 10, 34, 1};
        // int arr[] = {10, 10, 10, 10};
        // System.out.println(secondLargest(arr));

//        Node node = new Node(1);
//        node.next = new Node(2);
//        node.next.next = new Node(3);
//        node.next.next.next = new Node(4);
//        node.next.next.next.next = new Node(5);
        // Original List
//        System.out.println("Original List:");
//        printList(node);
//        System.out.println("Reversed List:");
//        Node reversedNode = reverseList(node);
//        printList(reversedNode);

        // Find middle node of Linked List
//        System.out.println(middleNode(node).data);

//        create cycle of nodes
//        Node head = new Node(3);
//        Node second = new Node(2);
//        Node third = new Node(0);
//        Node fourth = new Node(-4);
//
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = second; // Creates a cycle
//        // Detect a cycle in the LinkedList
//        System.out.println(detectCycle(head));

//        reverseString();

//        System.out.println("isPalindrome: " + isPalindrome("mada"));
//        System.out.println("isAnagram: " + isAnagram("listen", "silent"));
        System.out.println(firstNonRepeatingCharacter("loveleetcode"));

    }

    static String firstNonRepeatingCharacter(@NonNull String string) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            characterIntegerMap.put(
                    string.charAt(i),
                    characterIntegerMap.getOrDefault(string.charAt(i), 0) + 1
            );
        }

        for (int i = 0; i < string.length(); i++) {
            if (characterIntegerMap.get(string.charAt(i)) == 1) {
                return String.valueOf(string.charAt(i));
            }
        }
        return "-1";
    }

    static boolean isAnagram(@NonNull String s1, @NonNull String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(@NonNull String name) {
        int start = 0, end = name.length() - 1;
        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static void reverseString() {
        String str = "Hello";
        System.out.println(str);
        int totalLength = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < totalLength / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[totalLength - i - 1];
            charArray[totalLength - i - 1] = temp;
        }
        System.out.println(charArray);
    }

    private static boolean detectCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false; // If fast reaches the end, no cycle exists
    }

    public static Node middleNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node middleNode = slow;
        return middleNode;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    /**
     * Input:  1 -> 2 -> 3 -> 4 -> 5 -> NULL
     * Output: 5 -> 4 -> 3 -> 2 -> 1 -> NULL
     *
     * @param head
     */
    private static Node reverseList(Node head) {
        Node prev = null; // stores the previous node
        Node curr = head; // points to the current node
        Node next;
        while (curr != null) {
            next = curr.next; // Store the next node
            curr.next = prev; // Reverse the current node’s pointer
            prev = curr; // Move prev forward
            curr = next; // Move current forward
        }
        return prev; // Return prev as the new head of the reversed list
    }

    private static int secondLargest(int[] arr) {
        int second = Integer.MIN_VALUE, first = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    private static int[] moveZeros(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        return arr;
    }

    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }
        return index + 1;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
