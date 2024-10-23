package Strivers.linkedList.Medium.LengthLoop;

import Strivers.linkedList.model.ListNode;

import java.util.HashMap;
import java.util.Map;

public class LengthLoopBruteForce {
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
        ListNode temp = head;

        Map<ListNode, Integer> visitedNodes = new HashMap<>();

        Integer timer = 1;

        while (temp != null) {
            if(visitedNodes.containsKey(temp)) {
                Integer length = timer - visitedNodes.get(temp);
                return length;
            }

            visitedNodes.put(temp, timer);
            temp = temp.next;
            timer++;
        }

        return 0;
    }
}
