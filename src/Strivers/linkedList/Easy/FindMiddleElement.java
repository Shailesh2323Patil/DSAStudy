package Strivers.linkedList.Easy;

import Strivers.linkedList.model.ListNode;

public class FindMiddleElement {
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
        System.out.println("Middle in LinkedList = ");

        ListNode middle = middleLinkedList(node4);

        while (middle != null) {
            System.out.print(middle.val+" ");
            middle = middle.next;
        }
    }

    public static ListNode middleLinkedList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
