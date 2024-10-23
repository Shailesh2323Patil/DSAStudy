package Strivers.linkedList.Medium.LengthLoop;

import Strivers.linkedList.model.ListNode;

public class LengthLoopOptimal {
    public static void main(String[] args) {
        // Create a linked list with a loop
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // This creates a loop
        fifth.next = second;

        int loopLength = lengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }

    public static int lengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findLength(slow, fast);
            }
        }

        return 0;
    }

    public static int findLength(ListNode slow, ListNode fast) {
        int count = 1;
        fast = fast.next;

        while (slow != fast) {
            fast = fast.next;
            count++;
        }

        return count;
    }
}

