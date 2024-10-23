package Strivers.linkedList.Easy.ReverseLinkedList;

import Strivers.linkedList.model.ListNode;

public class ReverseLinkedListOptimal {
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
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode front = temp.next;

            temp.next = prev;

            prev = temp;
            temp = front;
        }

        return prev;
    }
}
