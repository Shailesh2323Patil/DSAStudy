package Strivers.linkedList.Easy.ReverseLinkedList;

import Strivers.linkedList.model.ListNode;

public class ReverseLinkedListRecursive {
    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        ListNode node2 = new ListNode(3, node);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(1, node3);

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
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseLinkedList(head.next);

        ListNode front = head.next;

        front.next = head;

        head.next = null;

        return newHead;
    }
}
