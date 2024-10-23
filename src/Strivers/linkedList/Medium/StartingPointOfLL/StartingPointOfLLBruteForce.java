package Strivers.linkedList.Medium.StartingPointOfLL;

import Strivers.linkedList.model.ListNode;

import java.util.HashMap;

public class StartingPointOfLLBruteForce {
    public static void main(String[] args) {
        // Create a sample linked list with a loop
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

        // Make a loop from node5 to node2
        node5.next = node2;

        // Set the head of the linked list
        ListNode head = node1;

        // Detect the loop in the linked list
        ListNode loopStartNode = detectLoop(head);

        if (loopStartNode != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.val);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }

    private static ListNode detectLoop(ListNode head) {
        ListNode temp = head;

        HashMap<ListNode, Integer> hashMap = new HashMap<>();

        while (temp != null) {
            if(hashMap.containsKey(temp)) {
                return temp;
            }

            hashMap.put(temp, temp.val);
            temp = temp.next;
        }

        return null;
    }
}
