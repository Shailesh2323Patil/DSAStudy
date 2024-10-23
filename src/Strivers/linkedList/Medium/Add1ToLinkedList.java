package Strivers.linkedList.Medium;

import Strivers.linkedList.model.ListNode;

public class Add1ToLinkedList {
    static int addWithCarry(ListNode head) {

        // If linked list is empty, return carry
        if (head == null) {
            return 1;
        }

        // Add carry returned by the next ListNode call
        int res = head.val + addWithCarry(head.next);

        // Update data and return new carry
        head.val = res % 10;
        return res / 10;
    }

    static ListNode addOne(ListNode head) {

        // Add 1 to linked list from end to beginning
        int carry = addWithCarry(head);

        // If there is carry after updating all nodes,
        // then we need to add a new ListNode to the linked list
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;

            // New ListNode becomes head now
            return newNode;
        }

        return head;
    }

    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 9 -> 9 -> 9
        ListNode head = new ListNode(1);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(8);

        head = addOne(head);

        printList(head);
    }
}
