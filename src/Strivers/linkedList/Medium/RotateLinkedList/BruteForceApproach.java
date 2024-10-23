package Strivers.linkedList.Medium.RotateLinkedList;

import Strivers.linkedList.model.ListNode;

public class BruteForceApproach {
    static ListNode insertNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }

    static void printList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println(head.val);

    }

    public static void main(String args[]) {
        ListNode head = null;
        //inserting ListNode
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 4);
        head = insertNode(head, 5);

        System.out.println("Original list: ");
        printList(head);

        int k = 2;
        ListNode newHead = rotateRight(head, k); //calling function for rotating right of the nodes by k times

        System.out.println("After " + k + " iterations: ");
        printList(newHead); //list after rotating nodes
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }

        for (int i = 0; i < k; i++) {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            ListNode end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }

        return head;
    }
}
