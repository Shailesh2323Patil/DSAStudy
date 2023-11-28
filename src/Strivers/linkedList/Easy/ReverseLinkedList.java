package Strivers.linkedList.Easy;

import Strivers.linkedList.model.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2, node);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);

        ListNode head = node4;

        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;
        }

        System.out.println();
        System.out.println("Reverse LinkedList = ");

        ListNode reverseHead = reverseLinkedList(node4);

        while (reverseHead != null) {
            System.out.print(reverseHead.val + " ");
            reverseHead = reverseHead.next;
        }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode newHead = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }
}
